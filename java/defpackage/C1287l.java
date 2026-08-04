package defpackage;

/* JADX INFO: renamed from: lؒۘٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1287l extends AbstractC15603l implements InterfaceC16189l {
    private static final C1287l zzb;
    private InterfaceC14009l zzd = C2742l.f5945l;

    static {
        C1287l c1287l = new C1287l();
        zzb = c1287l;
        AbstractC15603l.admob(C1287l.class, c1287l);
    }

    public static void metrica(C1287l c1287l, C17434l c17434l) {
        InterfaceC14009l interfaceC14009l = c1287l.zzd;
        if (!((AbstractC3486l) interfaceC14009l).f7371l) {
            int size = interfaceC14009l.size();
            c1287l.zzd = interfaceC14009l.purchase(size == 0 ? 10 : size + size);
        }
        c1287l.zzd.add(c17434l);
    }

    public static C0886l vip() {
        return (C0886l) zzb.amazon();
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C17434l.class});
        }
        if (i2 == 3) {
            return new C1287l();
        }
        if (i2 == 4) {
            return new C0886l(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
