package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;

/* JADX INFO: renamed from: lؚٕٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15541l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ CustomCatalogBlockItem f30370l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30371l;

    public /* synthetic */ C15541l(CustomCatalogBlockItem customCatalogBlockItem, int i) {
        this.f30371l = i;
        this.f30370l = customCatalogBlockItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f30371l;
        CustomCatalogBlockItem customCatalogBlockItem = this.f30370l;
        switch (i) {
            case 0:
                C8183l.yandex.loadAd(customCatalogBlockItem.mopub);
                break;
            default:
                C8183l.yandex.loadAd(customCatalogBlockItem.mopub);
                break;
        }
        return Unit.INSTANCE;
    }
}
