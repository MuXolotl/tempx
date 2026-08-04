package defpackage;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lُٜٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11044l extends AbstractC15603l implements InterfaceC16189l {
    private static final C11044l zzb;
    private byte zzA = 2;
    private int zzd;
    private int zze;
    private AbstractC1096l zzf;
    private String zzg;
    private C17910l zzh;
    private int zzi;
    private C12581l zzj;
    private C8601l zzk;
    private C17171l zzl;
    private C14268l zzm;
    private C16919l zzn;
    private C7019l zzo;
    private C1707l zzp;
    private C13433l zzq;
    private C14079l zzr;
    private C1754l zzs;
    private InterfaceC14009l zzt;
    private InterfaceC0250l zzu;
    private String zzv;
    private InterfaceC14009l zzw;
    private boolean zzx;
    private double zzy;
    private AbstractC1096l zzz;

    static {
        C11044l c11044l = new C11044l();
        zzb = c11044l;
        AbstractC15603l.admob(C11044l.class, c11044l);
    }

    public C11044l() {
        C1700l c1700l = AbstractC1096l.f3033l;
        this.zzf = c1700l;
        this.zzg = "";
        C2742l c2742l = C2742l.f5945l;
        this.zzt = c2742l;
        this.zzu = C14363l.f28110l;
        this.zzv = "";
        this.zzw = c2742l;
        this.zzx = true;
        this.zzz = c1700l;
    }

    public static void premium(C11044l c11044l, int i, C1885l c1885l) {
        InterfaceC14009l interfaceC14009l = c11044l.zzt;
        if (!((AbstractC3486l) interfaceC14009l).f7371l) {
            int size = interfaceC14009l.size();
            c11044l.zzt = interfaceC14009l.purchase(size == 0 ? 10 : size + size);
        }
        c11044l.zzt.set(i, c1885l);
    }

    public final C1707l Signature() {
        C1707l c1707l = this.zzp;
        return c1707l == null ? C1707l.startapp() : c1707l;
    }

    public final C16919l ad() {
        C16919l c16919l = this.zzn;
        return c16919l == null ? C16919l.vip() : c16919l;
    }

    public final C13433l adcel() {
        C13433l c13433l = this.zzq;
        return c13433l == null ? C13433l.startapp() : c13433l;
    }

    public final C12581l ads() {
        C12581l c12581l = this.zzj;
        return c12581l == null ? C12581l.metrica() : c12581l;
    }

    public final AbstractC1096l advert() {
        return this.zzf;
    }

    public final boolean applovin() {
        return (this.zzd & 4096) != 0;
    }

    public final boolean appmetrica() {
        return (this.zzd & 32) != 0;
    }

    public final boolean inmobi() {
        return (this.zzd & 8192) != 0;
    }

    public final String isVip() {
        return this.zzg;
    }

    public final C14268l license() {
        C14268l c14268l = this.zzm;
        return c14268l == null ? C14268l.vip() : c14268l;
    }

    public final int metrica() {
        return this.zzt.size();
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final boolean m3029native() {
        return (this.zzd & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final boolean m3030package() {
        return (this.zzd & 2048) != 0;
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public final int m3031private() {
        int iVip = AbstractC14425l.vip(this.zze);
        if (iVip == 0) {
            return 1;
        }
        return iVip;
    }

    public final C7019l pro() {
        C7019l c7019l = this.zzo;
        return c7019l == null ? C7019l.vip() : c7019l;
    }

    @Override // defpackage.AbstractC15603l
    public final Object remoteconfig(int i, AbstractC15603l abstractC15603l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzA);
        }
        if (i2 == 2) {
            return new C9025l(zzb, "\u0004\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0003\u000b\u0001ᴌ\u0000\u0002ᔊ\u0001\u0003ᔈ\u0002\u0004ᴌ\u0004\u0005ᐉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bЛ\fဈ\u000f\rЛ\u000eည\u0012\u000fᐉ\u000b\u0010ဉ\f\u0011ဉ\r\u0012\u0016\u0013ဉ\u000e\u0014ဇ\u0010\u0015က\u0011\u0017ဉ\u0003", new Object[]{"zzd", "zze", C8042l.mopub, "zzf", "zzg", "zzi", C8042l.admob, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzt", C1885l.class, "zzv", "zzw", C1885l.class, "zzz", "zzp", "zzq", "zzr", "zzu", "zzs", "zzx", "zzy", "zzh"});
        }
        if (i2 == 3) {
            return new C11044l();
        }
        if (i2 == 4) {
            return new C17527l(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzA = abstractC15603l == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final InterfaceC14009l signatures() {
        return this.zzt;
    }

    public final C17171l startapp() {
        C17171l c17171l = this.zzl;
        return c17171l == null ? C17171l.vip() : c17171l;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final boolean m3032strictfp() {
        return (this.zzd & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
    }

    public final C14079l subscription() {
        C14079l c14079l = this.zzr;
        return c14079l == null ? C14079l.vip() : c14079l;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final boolean m3033synchronized() {
        return (this.zzd & 128) != 0;
    }

    public final C8601l tapsense() {
        C8601l c8601l = this.zzk;
        return c8601l == null ? C8601l.vip() : c8601l;
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final boolean m3034throws() {
        return (this.zzd & 64) != 0;
    }

    public final int vip() {
        int iPurchase = AbstractC7798l.purchase(this.zzi);
        if (iPurchase == 0) {
            return 1;
        }
        return iPurchase;
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public final boolean m3035volatile() {
        return (this.zzd & 1024) != 0;
    }
}
