package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: lؔۥۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3034l extends AbstractC10453l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C3316l f6548l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final HashMap f6549l;

    public C3034l(C3316l c3316l) {
        super("require");
        this.f6549l = new HashMap();
        this.f6548l = c3316l;
    }

    @Override // defpackage.AbstractC10453l
    public final InterfaceC2167l yandex(C7502l c7502l, List list) {
        InterfaceC2167l interfaceC2167l;
        AbstractC13831l.purchase(1, "require", list);
        String strMopub = ((C17516l) c7502l.f15510l).purchase(c7502l, (InterfaceC2167l) list.get(0)).mopub();
        HashMap map = this.f6549l;
        if (map.containsKey(strMopub)) {
            return (InterfaceC2167l) map.get(strMopub);
        }
        HashMap map2 = (HashMap) this.f6548l.f7072l;
        if (map2.containsKey(strMopub)) {
            try {
                interfaceC2167l = (InterfaceC2167l) ((Callable) map2.get(strMopub)).call();
            } catch (Exception unused) {
                C8339l.smaato("Failed to create API implementation: ".concat(String.valueOf(strMopub)));
                return null;
            }
        } else {
            interfaceC2167l = InterfaceC2167l.f4805l;
        }
        if (interfaceC2167l instanceof AbstractC10453l) {
            map.put(strMopub, (AbstractC10453l) interfaceC2167l);
        }
        return interfaceC2167l;
    }
}
