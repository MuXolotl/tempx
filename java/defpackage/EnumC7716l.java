package defpackage;

import java.util.EnumSet;
import java.util.HashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 lًؑۛ, still in use, count: 1, list:
  (r0v0 lًؑۛ) from 0x00b1: INVOKE (r0v1 java.util.EnumSet) = 
  (r0v0 lًؑۛ)
  (wrap lًؑۛ[]:0x00a3: FILLED_NEW_ARRAY (r1v1 lًؑۛ), (r2v2 lًؑۛ), (r4v2 lًؑۛ), (r6v2 lًؑۛ), (r8v2 lًؑۛ), (r10v2 lًؑۛ) A[WRAPPED] (LINE:164) elemType: lًؑۛ)
 STATIC call: java.util.EnumSet.of(java.lang.Enum, java.lang.Enum[]):java.util.EnumSet A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>, E extends java.lang.Enum<E>[]):java.util.EnumSet<E extends java.lang.Enum<E>> VARARG (c), VARARG_CALL] (LINE:178)
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
/* JADX INFO: renamed from: lًؑۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC7716l {
    /* JADX INFO: Fake field, exist only in values array */
    NOTE_A("A"),
    /* JADX INFO: Fake field, exist only in values array */
    NOTE_B("B"),
    /* JADX INFO: Fake field, exist only in values array */
    NOTE_C("C"),
    /* JADX INFO: Fake field, exist only in values array */
    NOTE_D("D"),
    /* JADX INFO: Fake field, exist only in values array */
    NOTE_E("E"),
    /* JADX INFO: Fake field, exist only in values array */
    NOTE_F("F"),
    /* JADX INFO: Fake field, exist only in values array */
    NOTE_G("G"),
    FLAT("b"),
    SHARP("#"),
    MINOR("m"),
    /* JADX INFO: Fake field, exist only in values array */
    OFF_KEY("o");


    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final HashMap f16194l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final HashMap f16196l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f16197l;

    static {
        EnumSet<EnumC7716l> enumSetOf = EnumSet.of(enumC7716l, enumC7716l, enumC7716l, enumC7716l, enumC7716l, enumC7716l, enumC7716l);
        f16194l = new HashMap(values().length);
        for (EnumC7716l enumC7716l : enumSetOf) {
            f16194l.put(enumC7716l.f16197l, enumC7716l);
        }
        EnumSet<EnumC7716l> enumSetOf2 = EnumSet.of(FLAT, SHARP, MINOR);
        f16196l = new HashMap(values().length);
        for (EnumC7716l enumC7716l2 : enumSetOf2) {
            f16196l.put(enumC7716l2.f16197l, enumC7716l2);
        }
    }

    public EnumC7716l(String str) {
        super(str, i);
        this.f16197l = str;
    }

    public static EnumC7716l valueOf(String str) {
        return (EnumC7716l) Enum.valueOf(EnumC7716l.class, str);
    }

    public static EnumC7716l[] values() {
        return (EnumC7716l[]) f16192l.clone();
    }
}
