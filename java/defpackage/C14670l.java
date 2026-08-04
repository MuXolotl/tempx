package defpackage;

import java.math.BigInteger;

/* JADX INFO: renamed from: lٔؖؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14670l implements InterfaceC7882l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ byte f28700l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C13683l f28701l;

    public C14670l(C13683l c13683l, byte b) {
        this.f28701l = c13683l;
        this.f28700l = b;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.InterfaceC7882l
    public final InterfaceC14356l admob(InterfaceC14356l interfaceC14356l) {
        if (interfaceC14356l instanceof C10125l) {
            return interfaceC14356l;
        }
        C10125l c10125l = new C10125l();
        c10125l.yandex = null;
        BigInteger bigInteger = AbstractC15877l.yandex;
        C13683l c13683l = this.f28701l;
        AbstractC8859l abstractC8859lMetrica = c13683l.metrica();
        AbstractC11918l abstractC11918l = c13683l.yandex;
        C13683l c13683l2 = (C13683l) abstractC8859lMetrica;
        byte[][] bArr = this.f28700l == 0 ? AbstractC15877l.amazon : AbstractC15877l.billing;
        int length = (bArr.length + 1) >>> 1;
        C13683l[] c13683lArr = new C13683l[length];
        c13683lArr[0] = c13683l;
        int length2 = bArr.length;
        for (int i = 3; i < length2; i += 2) {
            int i2 = i >>> 1;
            byte[] bArr2 = bArr[i];
            C13683l c13683lM3654throws = (C13683l) abstractC11918l.remoteconfig();
            int i3 = 0;
            for (int length3 = bArr2.length - 1; length3 >= 0; length3--) {
                i3++;
                byte b = bArr2[length3];
                if (b != 0) {
                    c13683lM3654throws = (C13683l) c13683lM3654throws.m3654throws(i3).yandex(b > 0 ? c13683l : c13683l2);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                c13683lM3654throws = c13683lM3654throws.m3654throws(i3);
            }
            c13683lArr[i2] = c13683lM3654throws;
        }
        abstractC11918l.getClass();
        abstractC11918l.startapp(c13683lArr, 0, length, null);
        c10125l.yandex = c13683lArr;
        return c10125l;
    }
}
