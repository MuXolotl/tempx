package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lّْٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13458l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C0675l f26396l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13458l(C0675l c0675l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f26396l = c0675l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        AbstractC2829l.crashlytics(obj);
        C8688l c8688l = AbstractC0085l.yandex;
        AbstractC0085l abstractC0085lLoadAd = AbstractC8182l.loadAd();
        boolean z = abstractC0085lLoadAd instanceof C2659l;
        C0675l c0675l = this.f26396l;
        C8195l c8195lPremium = z ? AbstractC5941l.premium(c0675l.isVip(), ((C2659l) abstractC0085lLoadAd).loadAd().getAbsolutePath()) : AbstractC5941l.inmobi(c0675l.isVip());
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        Context applicationContext = vKXApplication.getApplicationContext();
        String str = C14025l.f27330l;
        return new C8147l(c8195lPremium, AbstractC6427l.smaato(C6162l.ads(applicationContext.getCacheDir())) + AbstractC6427l.smaato(C6162l.ads(applicationContext.getDir("artworkCache", 0))), AbstractC6427l.smaato(C6162l.ads(AbstractC8182l.loadAd().loadAd())), ((List) AbstractC0085l.yandex.getValue()).size() > 1, AbstractC8182l.loadAd().yandex() == 0 ? R.string.storage_external : R.string.storage_internal);
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C13458l(this.f26396l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C13458l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
