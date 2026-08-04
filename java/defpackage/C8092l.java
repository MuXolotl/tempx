package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lًِٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8092l extends AbstractC5555l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Catalog2Button f16870l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC1982l f16871l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Catalog2Layout.CompactHeader f16872l;

    public C8092l(InterfaceC1982l interfaceC1982l, Catalog2Layout.CompactHeader compactHeader, Catalog2Button catalog2Button) {
        this.f16871l = interfaceC1982l;
        this.f16872l = compactHeader;
        this.f16870l = catalog2Button;
    }

    @Override // defpackage.AbstractC5555l
    public final void isVip(int i, InterfaceC0589l interfaceC0589l) {
        C13651l c13651l = (C13651l) interfaceC0589l;
        ImageView imageView = c13651l.f26675l;
        TextView textView = c13651l.f26674l;
        c13651l.f26677l.setText(this.f16872l.yandex);
        Catalog2Button catalog2Button = this.f16870l;
        if (catalog2Button == null) {
            AbstractC5833l.purchase(imageView);
            AbstractC5833l.purchase(textView);
            return;
        }
        if (catalog2Button.yandex instanceof C5459l) {
            AbstractC5833l.purchase(textView);
            AbstractC5833l.subs(imageView);
            final int i2 = 0;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: lْٕۖ

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ C8092l f26305l;

                {
                    this.f26305l = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i2;
                    C8092l c8092l = this.f26305l;
                    switch (i3) {
                        case 0:
                            C5663l.f12024l.getClass();
                            new File(C5663l.f12023l, "OrbitSearchHistory.dat").delete();
                            c8092l.f16871l.tapsense();
                            break;
                        default:
                            C14100l.yandex(view.getContext(), c8092l.f16870l);
                            break;
                    }
                }
            });
            return;
        }
        AbstractC5833l.purchase(imageView);
        AbstractC5833l.subs(textView);
        textView.setText(catalog2Button.isPro);
        final int i3 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: lْٕۖ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C8092l f26305l;

            {
                this.f26305l = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                C8092l c8092l = this.f26305l;
                switch (i4) {
                    case 0:
                        C5663l.f12024l.getClass();
                        new File(C5663l.f12023l, "OrbitSearchHistory.dat").delete();
                        c8092l.f16871l.tapsense();
                        break;
                    default:
                        C14100l.yandex(view.getContext(), c8092l.f16870l);
                        break;
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.subs
    public final int mopub() {
        return 1;
    }

    @Override // defpackage.AbstractC5555l
    public final int premium() {
        return R.layout.c3_header_compact;
    }

    @Override // defpackage.AbstractC5555l
    public final InterfaceC0589l signatures(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.c3_header_compact, viewGroup, false);
        int i = R.id.close;
        ImageView imageView = (ImageView) AbstractC8576l.smaato(viewInflate, R.id.close);
        if (imageView != null) {
            i = R.id.show_all_btn;
            TextView textView = (TextView) AbstractC8576l.smaato(viewInflate, R.id.show_all_btn);
            if (textView != null) {
                i = R.id.title;
                TextView textView2 = (TextView) AbstractC8576l.smaato(viewInflate, R.id.title);
                if (textView2 != null) {
                    return new C13651l((FrameLayout) viewInflate, imageView, textView, textView2);
                }
            }
        }
        C6541l.subs("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
