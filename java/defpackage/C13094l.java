package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;

/* JADX INFO: renamed from: lؚْؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13094l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17242l f25616l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ CustomCatalogBlockItem f25617l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25618l;

    public /* synthetic */ C13094l(CustomCatalogBlockItem customCatalogBlockItem, InterfaceC17242l interfaceC17242l, int i, int i2) {
        this.f25618l = i2;
        this.f25617l = customCatalogBlockItem;
        this.f25616l = interfaceC17242l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f25618l;
        InterfaceC17242l interfaceC17242l = this.f25616l;
        CustomCatalogBlockItem customCatalogBlockItem = this.f25617l;
        C6956l c6956l = (C6956l) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC12959l.yandex(customCatalogBlockItem, interfaceC17242l, c6956l, AbstractC0545l.purchase(1));
                break;
            default:
                AbstractC18037l.amazon(customCatalogBlockItem, interfaceC17242l, c6956l, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
