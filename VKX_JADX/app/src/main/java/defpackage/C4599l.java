package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkapi2.objects.music.AudioFollowingsUpdateInfo;

/* JADX INFO: renamed from: lؗؒٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4599l extends AbstractC14630l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final int f9337l = View.generateViewId();

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final InterfaceC1982l f9338l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final Catalog2Block f9339l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C18662l f9340l = AbstractC11990l.loadAd();

    public C4599l(InterfaceC1982l interfaceC1982l, Catalog2Block catalog2Block) {
        this.f9338l = interfaceC1982l;
        this.f9339l = catalog2Block;
    }

    @Override // defpackage.AbstractC14630l
    public final int applovin() {
        return f9337l;
    }

    @Override // defpackage.AbstractC14630l
    public final void isVip(int i, Object obj, InterfaceC0589l interfaceC0589l) {
        C1101l c1101l = (C1101l) interfaceC0589l;
        ComposeView composeView = c1101l.f3037l;
        composeView.setViewCompositionStrategy(C11485l.f23077l);
        composeView.setContent(new C15578l(2075101845, true, new C0481l((AudioFollowingsUpdateInfo) obj, this, c1101l, 0)));
    }

    @Override // defpackage.AbstractC14630l
    public final InterfaceC0589l premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C1101l.yandex(layoutInflater, viewGroup);
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f9340l.f36440l;
    }
}
