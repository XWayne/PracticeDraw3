package com.hencoder.hencoderpracticedraw3.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice07SetUnderlineTextView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    String text = "Hello HenCoder gg";

    public Practice07SetUnderlineTextView(Context context) {
        super(context);
    }

    public Practice07SetUnderlineTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice07SetUnderlineTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setTextSize(60);
        paint.setUnderlineText(true);
        // 使用 Paint.setUnderlineText() 来设置下划线
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawText(text, 50, 100, paint);
    }
}
