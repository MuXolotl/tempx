package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lّۥِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12970l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C18014l f25431l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ String f25432l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f25433l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C10815l f25434l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12970l(C10815l c10815l, C18014l c18014l, String str, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f25434l = c10815l;
        this.f25431l = c18014l;
        this.f25432l = str;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0117 A[Catch: IOException -> 0x00b2, LOOP:0: B:10:0x0052->B:56:0x0117, LOOP_END, TryCatch #3 {IOException -> 0x00b2, blocks: (B:14:0x0061, B:16:0x0069, B:18:0x0096, B:22:0x009e, B:26:0x00c4, B:28:0x00ca, B:29:0x00cd, B:56:0x0117, B:57:0x0127, B:53:0x0111, B:25:0x00b5, B:58:0x0128, B:59:0x012f, B:50:0x010c), top: B:80:0x0061, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0127 A[SYNTHETIC] */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        String str;
        C14025l c14025lLoadAd;
        C1503l c1503l;
        Throwable th;
        C18014l c18014l = this.f25431l;
        C18730l c18730l = c18014l.f35207l;
        C15308l c15308l = c18014l.f35202l;
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f25433l;
        AbstractC2829l.crashlytics(obj);
        C10815l c10815l = this.f25434l;
        long j = c10815l.yandex;
        C2494l c2494l = c10815l.purchase;
        if (c2494l != null) {
            if (((ParcelFileDescriptor.AutoCloseInputStream) c2494l.f5290l) == null) {
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) c2494l.f5291l;
                AbstractC1051l.subs(parcelFileDescriptor);
                c2494l.f5290l = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = (ParcelFileDescriptor.AutoCloseInputStream) c2494l.f5290l;
            if (autoCloseInputStream != null) {
                C1503l c1503l2 = new C1503l(AbstractC7709l.purchase(autoCloseInputStream));
                C8688l c8688l = AbstractC0085l.yandex;
                AbstractC0085l abstractC0085lLoadAd = AbstractC8182l.loadAd();
                String str2 = C14025l.f27330l;
                C14025l c14025lAdcel = C6162l.adcel(abstractC0085lLoadAd.crashlytics().toString(), true);
                C12382l c12382l = AbstractC5921l.f12465l;
                while (true) {
                    boolean zSmaato = AbstractC11990l.smaato(interfaceC2262l);
                    str = this.f25432l;
                    if (!zSmaato || c1503l2.subs()) {
                        break;
                    }
                    try {
                        if (c1503l2.readByte() != 57) {
                            throw new IllegalArgumentException("Each file chunk should start with a terminator!");
                        }
                        short s = c1503l2.readShort();
                        C18250l c18250l = C15845l.f31097l;
                        C14025l c14025l = c14025lAdcel;
                        C3844l c3844lPremium = c1503l2.premium(s);
                        c18250l.getClass();
                        C15845l c15845l = (C15845l) c18250l.loadAd(new C2881l(c3844lPremium.subscription(), c3844lPremium.purchase()));
                        if (AbstractC8576l.yandex(c15845l.f31098l, ":database:")) {
                            String str3 = C14025l.f27330l;
                            VKXApplication vKXApplication = VKXApplication.f36631l;
                            if (vKXApplication == null) {
                                vKXApplication = null;
                            }
                            c14025lLoadAd = C6162l.ads(vKXApplication.getFilesDir()).purchase("vkx_main_cdcm");
                            c12382l.adcel(c14025lLoadAd, false);
                            c14025lAdcel = c14025l;
                        } else {
                            String str4 = C14025l.f27330l;
                            c14025lAdcel = c14025l;
                            c14025lLoadAd = billing.loadAd(c14025lAdcel, C6162l.adcel(c15845l.f31098l, true), false);
                        }
                        C14025l c14025lCrashlytics = c14025lLoadAd.crashlytics();
                        if (c14025lCrashlytics != null) {
                            c12382l.mopub(c14025lCrashlytics);
                        }
                        C7167l c7167l = new C7167l(c12382l.mo691continue(c14025lLoadAd, false));
                        C1503l c1503l3 = c1503l2;
                        try {
                            long j2 = c15845l.f31099l;
                            while (j2 > 0) {
                                c1503l = c1503l3;
                                try {
                                    long jAd = c1503l.ad(c7167l.f14998l, j2);
                                    if (jAd == -1) {
                                        throw new EOFException();
                                    }
                                    j2 -= jAd;
                                    c7167l.yandex();
                                    c1503l3 = c1503l;
                                } catch (Throwable th2) {
                                    th = th2;
                                    Throwable th3 = th;
                                    try {
                                        c7167l.close();
                                    } catch (Throwable th4) {
                                        AbstractC11718l.yandex(th3, th4);
                                    }
                                    th = th3;
                                    if (th == null) {
                                        throw th;
                                    }
                                    c15308l.subs(c15308l.admob() + 1);
                                    c1503l2 = c1503l;
                                }
                            }
                            c1503l = c1503l3;
                            try {
                                c7167l.close();
                                th = null;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            c1503l = c1503l3;
                        }
                        if (th == null) {
                            throw th;
                        }
                        c15308l.subs(c15308l.admob() + 1);
                        c1503l2 = c1503l;
                    } catch (IOException e) {
                        e.printStackTrace();
                        c18014l.m4460this(str, new C14614l(EnumC0780l.f2359l));
                        c18014l.m4458instanceof();
                        VKXApplication vKXApplication2 = VKXApplication.f36631l;
                        if (vKXApplication2 == null) {
                            vKXApplication2 = null;
                        }
                        C16552l c16552l = AbstractC11463l.yandex;
                        AbstractC10999l.mopub(vKXApplication2, ExecutorC6708l.f14063l, 0, new C14951l(c18014l, null, 10), 2);
                        c18730l.mopub(j);
                        return Unit.INSTANCE;
                    }
                }
                c18014l.m4460this(str, new C14614l(EnumC0780l.f2360l));
                VKXApplication vKXApplication3 = VKXApplication.f36631l;
                AbstractC10999l.mopub(vKXApplication3 != null ? vKXApplication3 : null, null, 0, new C0071l(2, null, 2), 3);
                c18014l.m4461try(C9388l.yandex);
                c18730l.mopub(j);
                return Unit.INSTANCE;
            }
        }
        C8339l.smaato("PS-StreamNull");
        return null;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C12970l c12970l = new C12970l(this.f25434l, this.f25431l, this.f25432l, interfaceC14029l);
        c12970l.f25433l = obj;
        return c12970l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C12970l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
