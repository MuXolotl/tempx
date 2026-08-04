package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lۣۣ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C18311l extends C2998l implements Function1 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C18311l f35812l = new C18311l(1, AbstractC12811l.class, "exitProcess", "exitProcess(I)Ljava/lang/Void;", 9);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        System.exit(((Number) obj).intValue());
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
