package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.List;
import ua.itaysonlab.catalogkit.objects.Catalog2Badge;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lُؔۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2979l extends AbstractC5555l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Catalog2Block f6485l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final AbstractC9694l f6486l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f6487l;

    public C2979l(AbstractC9694l abstractC9694l, String str, Catalog2Block catalog2Block) {
        this.f6486l = abstractC9694l;
        this.f6487l = str;
        this.f6485l = catalog2Block;
    }

    @Override // defpackage.AbstractC5555l
    public final void isVip(int i, InterfaceC0589l interfaceC0589l) {
        C1728l c1728l = (C1728l) interfaceC0589l;
        TextView textView = c1728l.f4128l;
        TextView textView2 = c1728l.f4124l;
        c1728l.f4127l.setText(this.f6487l);
        Catalog2Block.NoDataBlock noDataBlock = (Catalog2Block.NoDataBlock) this.f6485l;
        Catalog2Badge catalog2Badge = noDataBlock.billing;
        List list = noDataBlock.crashlytics;
        TextView textView3 = c1728l.f4125l;
        if (catalog2Badge != null) {
            AbstractC5833l.subs(textView3);
            textView3.setText(catalog2Badge.loadAd);
        } else {
            AbstractC5833l.purchase(textView3);
        }
        Catalog2Layout catalog2Layout = noDataBlock.loadAd;
        Catalog2Layout.ExtendedHeader extendedHeader = catalog2Layout instanceof Catalog2Layout.ExtendedHeader ? (Catalog2Layout.ExtendedHeader) catalog2Layout : null;
        String str = extendedHeader != null ? extendedHeader.loadAd : null;
        if (str == null || str.length() == 0) {
            AbstractC5833l.purchase(textView);
        } else {
            AbstractC5833l.subs(textView);
            textView.setText(str);
        }
        if (list == null || list.isEmpty()) {
            AbstractC5833l.purchase(textView2);
            return;
        }
        AbstractC5833l.subs(textView2);
        Catalog2Button catalog2Button = (Catalog2Button) AbstractC16901l.m4231native(list);
        textView2.setText(catalog2Button.isPro);
        textView2.setOnClickListener(new ViewOnClickListenerC18156l(catalog2Button, this));
        Catalog2ButtonAction catalog2ButtonAction = catalog2Button.yandex;
        if ((catalog2ButtonAction instanceof C2173l) || (catalog2ButtonAction instanceof C15196l)) {
            textView2.setText("");
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_chevron_right_circle_28, 0);
            AbstractC7741l.firebase(textView2, R.attr.text_primary);
        } else if (!(catalog2ButtonAction instanceof C0333l)) {
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_chevron_down_24, 0);
            AbstractC7741l.firebase(textView2, R.attr.global_accent);
        }
    }

    @Override // androidx.recyclerview.widget.subs
    public final int mopub() {
        return 1;
    }

    @Override // defpackage.AbstractC5555l
    public final int premium() {
        return R.layout.c3_header;
    }

    @Override // defpackage.AbstractC5555l
    public final InterfaceC0589l signatures(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.c3_header, viewGroup, false);
        int i = R.id.badge;
        TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.badge);
        if (textView != null) {
            i = R.id.extendedAlign;
            if (((LinearLayout) AbstractC8576l.smaato(viewInflate, R.id.extendedAlign)) != null) {
                i = R.id.show_all_btn;
                TextView textView2 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.show_all_btn);
                if (textView2 != null) {
                    i = R.id.subtitle;
                    TextView textView3 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.subtitle);
                    if (textView3 != null) {
                        i = R.id.title;
                        TextView textView4 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.title);
                        if (textView4 != null) {
                            return new C1728l((RelativeLayout) viewInflate, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
