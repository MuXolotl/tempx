package defpackage;

import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;

/* JADX INFO: renamed from: lًَؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10041l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f20467l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f20468l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f20469l;

    public /* synthetic */ C10041l(boolean z, Object obj, int i) {
        this.f20469l = i;
        this.f20468l = z;
        this.f20467l = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IOException {
        InterfaceC5995l interfaceC5995lSubs;
        int i = this.f20469l;
        Object obj = this.f20467l;
        boolean z = this.f20468l;
        switch (i) {
            case 0:
                C8039l c8039l = (C8039l) obj;
                CatalogArtist catalogArtist = c8039l.f16736l;
                if (z) {
                    File file = AbstractC7462l.yandex;
                    AbstractC7462l.loadAd.remove(catalogArtist.loadAd);
                    AbstractC7462l.crashlytics();
                } else {
                    File file2 = AbstractC7462l.yandex;
                    AbstractC7462l.loadAd.put(catalogArtist.loadAd, catalogArtist.yandex);
                    AbstractC7462l.crashlytics();
                }
                c8039l.f16735l.invoke();
                c8039l.purchase();
                return Unit.INSTANCE;
            case 1:
                InterfaceC5995l interfaceC5995l = (InterfaceC5995l) obj;
                if (z) {
                    interfaceC5995l.mopub(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            case 2:
                C14624l c14624l = (C14624l) obj;
                if (z && (interfaceC5995lSubs = c14624l.subs()) != null) {
                    ((C8490l) interfaceC5995lSubs).mopub(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            default:
                return Boolean.valueOf(z || ((C7473l) obj).purchase.admob() > 0.5f);
        }
    }
}
