package ir.thumbup.ash;

import com.ldoublem.thumbUplib.ThumbUpView;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.keywords.Common;
import anywheresoftware.b4a.objects.CustomViewWrapper;
import anywheresoftware.b4a.objects.LabelWrapper;
import anywheresoftware.b4a.objects.PanelWrapper;
import anywheresoftware.b4a.objects.ViewWrapper;
import anywheresoftware.b4a.objects.collections.Map;


/**
 * All attribute of this class start with Sh_
 */
@BA.Author("Ali Shojaee")
@BA.Version(1.0f)
@BA.ShortName("ShThumbUpButton")
@BA.ActivityObject
@BA.DependsOn(values = {"ShThumbUpButton.aar"})
@BA.Events(values = {"StateChange (Like As Boolean)"})
public class ShThumbUpButton extends ViewWrapper<ThumbUpView> implements Common.DesignerCustomView {

	@BA.Hide
	private ThumbUpView thumb_up;

	public int Type_Broken = 0;
	public int Type_Like = 1;
	public int Type_Unlike = 2;

	public void Initialize(BA ba, String EventName) {
		_initialize(ba, null, EventName);
	}

	@Override
	public void DesignerCreateView(PanelWrapper base, LabelWrapper labelWrapper, Map map) {
		CustomViewWrapper.replaceBaseWithView2(base, getObject());
	}

	@BA.Hide
	@Override
	public void _initialize(BA ba, Object o, String EventName) {
		this.thumb_up = new ThumbUpView(ba.context);
		this.thumb_up.setUnLikeType(ThumbUpView.LikeType.broken);
		this.thumb_up.setOnThumbUp(new ThumbUpView.OnThumbUp() {
			@Override
			public void like(boolean like) {
				ba.raiseEventFromUI(getObject(), EventName.toLowerCase(ba.cul) + "_statechange", like);
			}
		});

		this.setObject(this.thumb_up);
		this.innerInitialize(ba, EventName, true);
	}

	public void setSh_UnLikeType(int Type) {
		switch (Type) {
			case 0:
				this.thumb_up.setUnLikeType(ThumbUpView.LikeType.broken);
				break;
			case 1:
				this.thumb_up.setUnLikeType(ThumbUpView.LikeType.like);
				break;
			case 2:
				this.thumb_up.setUnLikeType(ThumbUpView.LikeType.unlike);
				break;
		}
	}

	public void setSh_CracksColor(int Color) {
		this.thumb_up.setCracksColor(Color);
	}

	public void setSh_FillColor(int Color) {
		this.thumb_up.setFillColor(Color);
	}

	public void setSh_EdgeColor(int Color) {
		this.thumb_up.setEdgeColor(Color);
	}

	public boolean IsLike() {
		return this.thumb_up.is_like();
	}

	public void Like() {
		this.thumb_up.Like();
	}

	public void UnLike() {
		this.thumb_up.UnLike();
	}
}
