package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;

/* JADX INFO: renamed from: l٘ۢ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18294l extends AbstractC14630l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final int f35786l = View.generateViewId();

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C18662l f35787l = AbstractC11990l.loadAd();

    @Override // defpackage.AbstractC14630l
    public final int applovin() {
        return f35786l;
    }

    @Override // defpackage.AbstractC14630l
    public final void isVip(int i, Object obj, InterfaceC0589l interfaceC0589l) {
        ComposeView composeView = ((C1101l) interfaceC0589l).f3037l;
        composeView.setViewCompositionStrategy(C11485l.f23077l);
        composeView.setContent(new C15578l(-706473264, true, new C8056l((CustomCatalogBlockItem) obj, 2)));
    }

    @Override // defpackage.AbstractC14630l
    public final InterfaceC0589l premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C1101l.yandex(layoutInflater, viewGroup);
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f35787l.f36440l;
    }
}
