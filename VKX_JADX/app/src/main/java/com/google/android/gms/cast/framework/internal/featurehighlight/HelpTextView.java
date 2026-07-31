package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import ua.itaysonlab.vkx.R;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class HelpTextView extends LinearLayout {
    TextView bodyTextView;
    TextView headerTextView;

    @Keep
    public HelpTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void setTextAndVisibility(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(true != TextUtils.isEmpty(charSequence) ? 0 : 8);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.cast_featurehighlight_help_text_header_view);
        textView.getClass();
        this.headerTextView = textView;
        TextView textView2 = (TextView) findViewById(R.id.cast_featurehighlight_help_text_body_view);
        textView2.getClass();
        this.bodyTextView = textView2;
    }

    @Keep
    public void setText(CharSequence charSequence, CharSequence charSequence2) {
        setTextAndVisibility(this.headerTextView, charSequence);
        setTextAndVisibility(this.bodyTextView, charSequence2);
    }

    @Keep
    public View asView() {
        return this;
    }
}
