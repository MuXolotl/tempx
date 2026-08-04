package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٖؗۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5145l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C18174l f11188l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11189l;

    public /* synthetic */ C5145l(C18174l c18174l, int i) {
        this.f11189l = i;
        this.f11188l = c18174l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f11189l;
        C18174l c18174l = this.f11188l;
        switch (i) {
            case 0:
                if (AbstractC3759l.billing(c18174l) == null) {
                    return null;
                }
                ((C7757l) c18174l.f35589l.f20463l).pro.getClass();
                return null;
            case 1:
                C12875l c12875l = c18174l.f35592l;
                ArrayList<C16765l> typeParameters = c12875l.getTypeParameters();
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(typeParameters, 10));
                for (C16765l c16765l : typeParameters) {
                    InterfaceC16902l interfaceC16902lStartapp = ((InterfaceC7483l) c18174l.f35596l.f20462l).startapp(c16765l);
                    if (interfaceC16902lStartapp == null) {
                        throw new AssertionError("Parameter " + c16765l + " surely belongs to class " + c12875l + ", so it must be resolved");
                    }
                    arrayList.add(interfaceC16902lStartapp);
                }
                return arrayList;
            default:
                return AbstractC17653l.loadAd(c18174l);
        }
    }
}
