package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lٌؘۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6141l extends AbstractC16860l {
    public static final /* synthetic */ InterfaceC13922l[] admob = {new C0544l(C6141l.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0)};
    public C10750l billing;
    public final C2278l mopub;

    public C6141l(C16412l c16412l) throws IOException {
        super(c16412l);
        this.mopub = new C2278l(c16412l, new C0340l(this, c16412l, false, 27));
        int iInmobi = AbstractC5020l.inmobi(1);
        if (iInmobi != 0) {
            if (iInmobi == 1) {
                crashlytics();
            } else if (iInmobi == 2) {
                crashlytics();
            } else {
                C18725l.billing();
                throw null;
            }
        }
    }

    @Override // defpackage.AbstractC16860l
    public final InterfaceC9630l amazon() {
        return m1959volatile();
    }

    @Override // defpackage.AbstractC16860l
    public final Iterable remoteconfig() {
        return AbstractC16901l.m4215default(super.remoteconfig(), new C13518l(this.amazon, smaato()));
    }

    @Override // defpackage.AbstractC16860l
    public final InterfaceC10240l startapp() {
        return m1959volatile();
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final C11410l m1959volatile() {
        InterfaceC13922l interfaceC13922l = admob[0];
        return (C11410l) this.mopub.invoke();
    }
}
