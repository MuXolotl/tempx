package defpackage;

import java.util.ArrayList;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v1 lٓۥؒ[], still in use, count: 1, list:
  (r5v1 lٓۥؒ[]) from 0x0039: CONSTRUCTOR (r0v1 lِٟٓ) = (r5v1 lٓۥؒ[]) A[MD:(java.lang.Enum[]):void (m)] (LINE:58) call: lِٟٓ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: lٓۥؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC14535l {
    READ(1),
    WRITE(4),
    ACCEPT(16),
    /* JADX INFO: Fake field, exist only in values array */
    CONNECT(8);


    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final int[] f28459l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final EnumC14535l[] f28461l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f28465l;

    static {
        C14092l c14092l = new C14092l(enumC14535lArr);
        f28461l = (EnumC14535l[]) AbstractC18648l.mopub(c14092l, new EnumC14535l[0]);
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(c14092l, 10));
        C11521l c11521l = new C11521l(0, c14092l);
        while (c11521l.hasNext()) {
            arrayList.add(Integer.valueOf(((EnumC14535l) c11521l.next()).f28465l));
        }
        f28459l = AbstractC16901l.m4222implements(arrayList);
    }

    public EnumC14535l(int i) {
        super(str, i);
        this.f28465l = i;
    }

    public static EnumC14535l valueOf(String str) {
        return (EnumC14535l) Enum.valueOf(EnumC14535l.class, str);
    }

    public static EnumC14535l[] values() {
        return (EnumC14535l[]) f28460l.clone();
    }
}
