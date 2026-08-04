package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;

/* JADX INFO: renamed from: lٌٖٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14922l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C18396l f29374l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29375l;

    public /* synthetic */ C14922l(C18396l c18396l, int i) {
        this.f29375l = i;
        this.f29374l = c18396l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f29375l;
        C18396l c18396l = this.f29374l;
        C4456l c4456l = (C4456l) obj;
        switch (i) {
            case 0:
                new C16553l((CatalogArtist) c18396l.f35934l, false).Signature(c4456l.f5081l);
                c4456l.purchase();
                break;
            case 1:
                new C2157l(new C15268l((CatalogArtist) c18396l.f35934l)).Signature(c4456l.f5081l);
                c4456l.purchase();
                break;
            case 2:
                new C8039l((CatalogArtist) c18396l.f35934l, (Cconst) c18396l.f35933l).Signature(c4456l.f5081l);
                c4456l.purchase();
                break;
            case 3:
                new C8039l((CatalogArtist) c18396l.f35934l, (Cconst) c18396l.f35933l).Signature(c4456l.f5081l);
                c4456l.purchase();
                break;
            default:
                new C16553l((CatalogArtist) c18396l.f35934l, true).Signature(c4456l.f5081l);
                c4456l.purchase();
                break;
        }
        return Unit.INSTANCE;
    }
}
