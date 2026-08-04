package defpackage;

import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٜؑؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0006l extends AbstractC5555l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final int f858l = View.generateViewId();

    @Override // defpackage.AbstractC5555l
    public final void isVip(int i, InterfaceC0589l interfaceC0589l) {
        C2784l c2784l = (C2784l) interfaceC0589l;
        TextView textView = c2784l.f6083l;
        SharedPreferences sharedPreferences = AbstractC3630l.yandex;
        EnumC14530l enumC14530l = EnumC14530l.f28449l;
        textView.setVisibility(AbstractC3630l.yandex(enumC14530l) ? 8 : 0);
        c2784l.f6082l.setText(!AbstractC3630l.yandex(enumC14530l) ? "Unknown block" : "");
    }

    @Override // androidx.recyclerview.widget.subs
    public final int mopub() {
        return 1;
    }

    @Override // defpackage.AbstractC5555l
    public final int premium() {
        return f858l;
    }

    @Override // defpackage.AbstractC5555l
    public final InterfaceC0589l signatures(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.c3_text, viewGroup, false);
        if (viewInflate != null) {
            TextView textView = (TextView) viewInflate;
            return new C2784l(textView, textView);
        }
        C6541l.subs("rootView");
        return null;
    }
}
