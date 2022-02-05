# ShThumbUpButton-B4A
Wrapped B4A library from https://github.com/ldoublem/ThumbUp

## Preview 
![B4A](https://github.com/Salar82/ShThumbUpButton-B4A/blob/master/Preview/preview.gif)


## [Download Library](https://github.com/Salar82/ShThumbUpButton-B4A/raw/master/Download/ShThumbUpButton.zip)


## Features
- ### Designer Support
- ### Simple to use
- ### Full Customize
- ...

## Usage

- ### Initialized in designer
```
Sub Globals
	Private ShThumbUpButton1 As ShThumbUpButton
End Sub


Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("Layout")
	
	ShThumbUpButton1.Sh_CracksColor = Colors.White
	ShThumbUpButton1.Sh_FillColor = 0xFFFF7700
	ShThumbUpButton1.Sh_EdgeColor = Colors.Magenta
	ShThumbUpButton1.Sh_UnLikeType = ShThumbUpButton1.Type_Broken
	
End Sub
```
- ### With code
```
Sub Globals
	Dim ShThumbUpButton1 As ShThumbUpButton
End Sub


Sub Activity_Create(FirstTime As Boolean)
	ShThumbUpView1.Initialize("ShThumbUpView1")
	Activity.AddView(ShThumbUpView1, 0dip, 50dip, 50dip, 50dip)
	
	ShThumbUpButton1.Sh_CracksColor = Colors.White
	ShThumbUpButton1.Sh_FillColor = 0xFFFF7700
	ShThumbUpButton1.Sh_EdgeColor = Colors.Magenta
	ShThumbUpButton1.Sh_UnLikeType = ShThumbUpButton1.Type_Broken
	
End Sub
```

## Event
- ### StateChange (Like As Boolean)
```
Private Sub ShThumbUpView1_StateChange (Like As Boolean)
	'Log($"Like: ${Like}"$)  ' TODTO
End Sub
```

## About Me
#### A developer in Iran :)


## License
```MIT License

Copyright (c) 2022 Ali Shojaee

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.```