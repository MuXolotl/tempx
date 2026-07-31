package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَۘۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10525l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11446l f21412l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21413l;

    public /* synthetic */ C10525l(C11446l c11446l, int i) {
        this.f21413l = i;
        this.f21412l = c11446l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        EnumC10474l enumC10474l;
        int i = this.f21413l;
        C11446l c11446l = this.f21412l;
        int i2 = 1;
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC7876l.yandex((C0764l) c11446l.vip.getValue(), AbstractC14566l.amazon(-825022247, new C10525l(c11446l, i2), c6956l), c6956l, 48, 0);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c11446l.smaato(null, c6956l, 0, 1);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (((String) c11446l.smaato.getValue()).length() > 0) {
                        enumC10474l = EnumC10474l.f21335l;
                    } else {
                        enumC10474l = (c11446l.mopub || ((String) c11446l.smaato.getValue()).length() != 0) ? EnumC10474l.f21337l : EnumC10474l.f21336l;
                    }
                    c11446l.firebase(enumC10474l, c6956l, 48);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
