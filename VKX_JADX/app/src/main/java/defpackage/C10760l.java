package defpackage;

/* JADX INFO: renamed from: lُؐۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C10760l implements InterfaceC0582l {
    public static final C10760l INSTANCE = new C10760l();
    public static final /* synthetic */ InterfaceC1220l yandex = AbstractC9968l.crashlytics(2, new C6573l(4));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C10760l);
    }

    public final int hashCode() {
        return -581279661;
    }

    public final InterfaceC16588l serializer() {
        return (InterfaceC16588l) yandex.getValue();
    }

    public final String toString() {
        return "NetworkIssue";
    }
}
