package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.IOException;
import ua.itaysonlab.vkapi2.objects.radio.RadioStation;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lِٕۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15624l extends AbstractC14630l {
    @Override // defpackage.AbstractC14630l
    public final int applovin() {
        return R.layout.c3_link_vertical;
    }

    @Override // defpackage.AbstractC14630l
    public final void isVip(int i, Object obj, InterfaceC0589l interfaceC0589l) throws IOException {
        RadioStation radioStation = (RadioStation) obj;
        C15544l c15544l = (C15544l) interfaceC0589l;
        ImageView imageView = c15544l.f30383l;
        imageView.setBackgroundColor(-1);
        imageView.setOutlineProvider(new C4021l());
        imageView.setClipToOutline(true);
        String str = radioStation.amazon;
        C13177l c13177lYandex = AbstractC2952l.yandex(imageView.getContext());
        C9477l c9477l = new C9477l(imageView.getContext());
        c9477l.crashlytics = str;
        AbstractC10413l.amazon(c9477l, imageView);
        c9477l.ads = 1;
        VKXApplication.Companion companion = VKXApplication.f36628l;
        AbstractC12872l.crashlytics(c9477l, new C1061l(VKXApplication.Companion.yandex(8.0f)));
        c13177lYandex.yandex(c9477l.yandex());
        c15544l.f30385l.setText(radioStation.loadAd);
        LinearLayout linearLayout = c15544l.f30384l;
        AbstractC0977l.yandex(linearLayout);
        linearLayout.setOnClickListener(new ViewOnClickListenerC8318l(radioStation, 1));
    }

    @Override // defpackage.AbstractC14630l
    public final InterfaceC0589l premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C15544l.yandex(layoutInflater, viewGroup);
    }
}
