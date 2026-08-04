package defpackage;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import ua.itaysonlab.vkapi2.objects.music.SmartSuggestion;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٌٛۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8914l extends AbstractC14630l {
    @Override // defpackage.AbstractC14630l
    public final int applovin() {
        return R.layout.c3_search_suggestion;
    }

    @Override // defpackage.AbstractC14630l
    public final void isVip(int i, Object obj, InterfaceC0589l interfaceC0589l) {
        SmartSuggestion smartSuggestion = (SmartSuggestion) obj;
        C9480l c9480l = (C9480l) interfaceC0589l;
        StringBuilder sb = new StringBuilder();
        String str = smartSuggestion.yandex;
        sb.append(str);
        sb.append(' ');
        sb.append(smartSuggestion.loadAd);
        String string = sb.toString();
        SpannableString spannableString = new SpannableString(string);
        VKXApplication.Companion companion = VKXApplication.f36628l;
        spannableString.setSpan(new ForegroundColorSpan(AbstractC13209l.yandex(android.R.attr.textColorSecondary)), str.length(), string.length(), 33);
        c9480l.f19361l.setText(spannableString);
        c9480l.f19362l.setOnClickListener(new ViewOnClickListenerC9657l(9, smartSuggestion));
    }

    @Override // defpackage.AbstractC14630l
    public final InterfaceC0589l premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.c3_search_suggestion, viewGroup, false);
        TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.catalog_item_title);
        if (textView != null) {
            return new C9480l((LinearLayout) viewInflate, textView);
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.catalog_item_title)));
        return null;
    }
}
