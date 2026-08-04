package defpackage;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ua.itaysonlab.vkapi2.objects.music.SmartSuggestion;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؕۨۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3815l extends AbstractC14630l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final InterfaceC1982l f7925l;

    public C3815l(InterfaceC1982l interfaceC1982l) {
        this.f7925l = interfaceC1982l;
    }

    @Override // defpackage.AbstractC14630l
    public final int applovin() {
        return R.layout.c3_search_suggestion_vertical;
    }

    @Override // defpackage.AbstractC14630l
    public final void isVip(int i, Object obj, InterfaceC0589l interfaceC0589l) {
        SmartSuggestion smartSuggestion = (SmartSuggestion) obj;
        StringBuilder sb = new StringBuilder();
        String str = smartSuggestion.yandex;
        sb.append(str);
        sb.append(' ');
        sb.append(smartSuggestion.loadAd);
        String string = sb.toString();
        SpannableString spannableString = new SpannableString(string);
        VKXApplication.Companion companion = VKXApplication.f36628l;
        spannableString.setSpan(new ForegroundColorSpan(AbstractC13209l.yandex(android.R.attr.textColorSecondary)), str.length(), string.length(), 33);
        TextView textView = ((C1262l) interfaceC0589l).f3291l;
        textView.setText(spannableString);
        textView.setOnClickListener(new ViewOnClickListenerC18156l(smartSuggestion, this, 4));
    }

    @Override // defpackage.AbstractC14630l
    public final InterfaceC0589l premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.c3_search_suggestion_vertical, viewGroup, false);
        if (viewInflate != null) {
            return new C1262l((TextView) viewInflate);
        }
        C6541l.subs("rootView");
        return null;
    }
}
