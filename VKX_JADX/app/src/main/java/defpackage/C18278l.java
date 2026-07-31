package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: l٘ۡۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18278l extends AbstractC17187l {
    private static final C18278l zzaz;
    private InterfaceC12239l zzA;
    private InterfaceC12239l zzB;
    private C17300l zzC;
    private int zzD;
    private int zzE;
    private C18300l zzF;
    private int zzG;
    private C18721l zzH;
    private InterfaceC12239l zzI;
    private C18300l zzJ;
    private int zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    private int zzO;
    private int zzP;
    private C5972l zzQ;
    private C0216l zzR;
    private C8451l zzS;
    private C3732l zzT;
    private C1783l zzU;
    private C9960l zzV;
    private C12082l zzW;
    private InterfaceC12239l zzX;
    private C13655l zzY;
    private int zzZ;
    private C11019l zzaa;
    private InterfaceC12239l zzab;
    private boolean zzac;
    private boolean zzad;
    private int zzae;
    private C9306l zzaf;
    private C0689l zzag;
    private C14495l zzah;
    private C6750l zzai;
    private C6281l zzaj;
    private C3296l zzak;
    private C0835l zzal;
    private int zzam;
    private int zzan;
    private int zzao;
    private InterfaceC12239l zzap;
    private C0568l zzaq;
    private C1369l zzar;
    private C3057l zzas;
    private C6887l zzat;
    private C14170l zzau;
    private C9078l zzav;
    private C13108l zzaw;
    private C11729l zzax;
    private int zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private int zzg;
    private C15436l zzh;
    private C16606l zzi;
    private C11887l zzj;
    private C5919l zzk;
    private C10580l zzl;
    private C17127l zzm;
    private C1862l zzn;
    private C13827l zzo;
    private C3960l zzq;
    private C5734l zzr;
    private int zzu;
    private C5561l zzv;
    private InterfaceC12239l zzy;
    private InterfaceC12239l zzz;
    private byte zzay = 2;
    private String zzp = "";
    private String zzs = "";
    private String zzt = "";
    private String zzw = "";
    private InterfaceC7913l zzx = C4522l.f9159l;

    static {
        C18278l c18278l = new C18278l();
        zzaz = c18278l;
        AbstractC17187l.mopub(C18278l.class, c18278l);
    }

    public C18278l() {
        C4650l c4650l = C4650l.f9468l;
        this.zzy = c4650l;
        this.zzz = c4650l;
        this.zzA = c4650l;
        this.zzB = c4650l;
        this.zzI = c4650l;
        this.zzX = c4650l;
        this.zzab = c4650l;
        this.zzap = c4650l;
    }

    public static C15010l remoteconfig() {
        return (C15010l) zzaz.crashlytics();
    }

    public static C15010l vip(C18278l c18278l) {
        AbstractC1506l abstractC1506lCrashlytics = zzaz.crashlytics();
        AbstractC17187l abstractC17187l = abstractC1506lCrashlytics.f3758l;
        if (!abstractC17187l.equals(c18278l)) {
            if (!abstractC1506lCrashlytics.f3757l.isPro()) {
                AbstractC17187l abstractC17187l2 = (AbstractC17187l) abstractC17187l.subs(4, null);
                C12765l.crashlytics.yandex(abstractC17187l2.getClass()).yandex(abstractC17187l2, abstractC1506lCrashlytics.f3757l);
                abstractC1506lCrashlytics.f3757l = abstractC17187l2;
            }
            AbstractC17187l abstractC17187l3 = abstractC1506lCrashlytics.f3757l;
            C12765l.crashlytics.yandex(abstractC17187l3.getClass()).yandex(abstractC17187l3, c18278l);
        }
        return (C15010l) abstractC1506lCrashlytics;
    }

    public final /* synthetic */ void Signature(int i) {
        this.zzb |= RecyclerView.UNDEFINED_DURATION;
        this.zzP = i;
    }

    public final void ad(C15809l c15809l) {
        InterfaceC12239l interfaceC12239l = this.zzX;
        if (!((AbstractC13676l) interfaceC12239l).f26706l) {
            int size = interfaceC12239l.size();
            this.zzX = interfaceC12239l.subs(size + size);
        }
        this.zzX.add(c15809l);
    }

    public final /* synthetic */ void adcel(String str) {
        str.getClass();
        this.zzb |= 16384;
        this.zzs = str;
    }

    public final /* synthetic */ void ads(String str) {
        str.getClass();
        this.zzb |= 32768;
        this.zzt = str;
    }

    public final /* synthetic */ void advert(C9306l c9306l) {
        this.zzaf = c9306l;
        this.zzd |= 8192;
    }

    public final /* synthetic */ void isVip(C3057l c3057l) {
        this.zzas = c3057l;
        this.zzd |= 33554432;
    }

    public final /* synthetic */ void license(C0216l c0216l) {
        this.zzR = c0216l;
        this.zzd |= 2;
    }

    public final /* synthetic */ void metrica(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    public final /* synthetic */ void pro(C8451l c8451l) {
        this.zzS = c8451l;
        this.zzd |= 4;
    }

    public final C0216l smaato() {
        C0216l c0216l = this.zzR;
        return c0216l == null ? C0216l.vip() : c0216l;
    }

    public final /* synthetic */ void startapp(String str) {
        str.getClass();
        this.zzb |= 2048;
        this.zzp = str;
    }

    @Override // defpackage.AbstractC17187l
    public final Object subs(int i, AbstractC17187l abstractC17187l) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzay);
        }
        if (i2 == 2) {
            return new C4687l(zzaz, "\u0001H\u0000\u0002\u0001HH\u0000\t\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဈ\u000e\nဉ\b\u000bဉ\t\fဉ\n\rဈ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u0011\u0011ဈ\u0012\u0012\u0016\u0013\u001b\u0014\u001b\u0015\u001b\u0016\u001b\u0017᠌\u0014\u0018ဉ\u0018\u0019\u001b\u001aဉ\u0019\u001b᠌\u001b\u001cင\u001c\u001dင\u001d\u001eင\u001e\u001fဆ\u001f ဉ !ဉ!\"ဉ##᠌\u0015$ဉ\u0016%ᐉ$&ဉ%'ဉ&(\u001b)᠌(*ဉ)+\u001b,᠌\u001a-ဇ*.ဇ+/᠌,0ဉ-1င\u00172ဉ.3ဉ/4ဉ15ဉ26ဉ37᠌48᠌59᠌6:\u001b;ဈ\u000f<ဉ7=ဉ0>ဉ\u0013?ဉ\"@င\u0010Aဉ8Bဉ'Cဉ9Dဉ:Eဉ;Fဉ<Gဉ=Hဉ>", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", C13863l.f27122l, "zzh", "zzi", "zzj", "zzk", "zzl", "zzs", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzv", "zzw", "zzx", "zzy", C13862l.class, "zzz", C5955l.class, "zzA", C7570l.class, "zzB", C6785l.class, "zzD", C7472l.f15447l, "zzH", "zzI", C18300l.class, "zzJ", "zzL", C18450l.f36024l, "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzT", "zzE", C2782l.f6049l, "zzF", "zzU", "zzV", "zzW", "zzX", C15809l.class, "zzZ", C6928l.f14499l, "zzaa", "zzab", C3353l.class, "zzK", C14823l.f28998l, "zzac", "zzad", "zzae", C13772l.f26870l, "zzaf", "zzG", "zzag", "zzah", "zzaj", "zzak", "zzal", "zzam", C2782l.f6054l, "zzan", C6168l.f13005l, "zzao", C18450l.f36045l, "zzap", C1270l.class, "zzt", "zzaq", "zzai", "zzC", "zzS", "zzu", "zzar", "zzY", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax"});
        }
        if (i2 == 3) {
            return new C18278l();
        }
        if (i2 == 4) {
            return new C15010l(zzaz);
        }
        if (i2 == 5) {
            return zzaz;
        }
        this.zzay = abstractC17187l == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final /* synthetic */ void subscription(int i) {
        this.zzb |= 65536;
        this.zzu = i;
    }

    public final /* synthetic */ void tapsense(String str) {
        this.zzb |= 262144;
        this.zzw = str;
    }
}
