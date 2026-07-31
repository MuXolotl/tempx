package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lْٛ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13503l extends AbstractC15603l implements InterfaceC16189l {
    private static final C13503l zzb;
    private int zzd;
    private int zzf;
    private byte zzi = 2;
    private InterfaceC14009l zze = C2742l.f5945l;
    private String zzg = "";
    private AbstractC1096l zzh = AbstractC1096l.f3033l;

    static {
        C13503l c13503l = new C13503l();
        zzb = c13503l;
        AbstractC15603l.admob(C13503l.class, c13503l);
    }

    public static C13503l vip(byte[] bArr, C14545l c14545l) throws C18299l {
        AbstractC15603l abstractC15603l = zzb;
        int length = bArr.length;
        if (length != 0) {
            AbstractC15603l abstractC15603l2 = (AbstractC15603l) abstractC15603l.remoteconfig(4, null);
            try {
                InterfaceC12353l interfaceC12353lYandex = C13940l.crashlytics.yandex(abstractC15603l2.getClass());
                interfaceC12353lYandex.amazon(abstractC15603l2, bArr, 0, length, new C13275l(c14545l));
                interfaceC12353lYandex.yandex(abstractC15603l2);
                abstractC15603l = abstractC15603l2;
            } catch (C18299l e) {
                throw e;
            } catch (IOException e2) {
                if (e2.getCause() instanceof C18299l) {
                    throw ((C18299l) e2.getCause());
                }
                throw new C18299l(e2.getMessage(), e2);
            } catch (IndexOutOfBoundsException unused) {
                C11586l.billing("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            } catch (C1360l e3) {
                C11586l.billing(e3.getMessage());
                return null;
            }
        }
        if (abstractC15603l == null || AbstractC15603l.isPro(abstractC15603l, true)) {
            return (C13503l) abstractC15603l;
        }
        C11586l.billing(new C1360l().getMessage());
        return null;
    }

    public final InterfaceC14009l metrica() {
        return this.zze;
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzi);
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᴌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", C11044l.class, "zzf", C8042l.crashlytics, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C13503l();
        }
        if (i2 == 4) {
            return new C15947l(14, zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzi = abstractC15603l == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
