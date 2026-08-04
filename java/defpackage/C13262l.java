package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;

/* JADX INFO: renamed from: lٍْۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13262l extends AbstractC5563l implements Function5 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public /* synthetic */ InterfaceC5130l f26034l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public /* synthetic */ EnumC7195l f26035l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ List f26036l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ List f26037l;

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        List list = this.f26036l;
        List list2 = this.f26037l;
        InterfaceC5130l interfaceC5130l = this.f26034l;
        EnumC7195l enumC7195l = this.f26035l;
        AbstractC2829l.crashlytics(obj);
        int iOrdinal = enumC7195l.ordinal();
        if (iOrdinal == 0) {
            return list;
        }
        if (iOrdinal == 1) {
            return list2;
        }
        if (iOrdinal == 2) {
            return interfaceC5130l;
        }
        C18725l.billing();
        return null;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C13262l c13262l = new C13262l(5, (InterfaceC14029l) obj5);
        c13262l.f26036l = (List) obj;
        c13262l.f26037l = (List) obj2;
        c13262l.f26034l = (InterfaceC5130l) obj3;
        c13262l.f26035l = (EnumC7195l) obj4;
        return c13262l.Signature(Unit.INSTANCE);
    }
}
