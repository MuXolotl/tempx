package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.UUID;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٖؗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16200l extends AbstractC16817l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9453l f31697l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f31698l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f31699l;

    public /* synthetic */ C16200l(AbstractC9453l abstractC9453l, Object obj, int i) {
        this.f31698l = i;
        this.f31697l = abstractC9453l;
        this.f31699l = obj;
    }

    @Override // defpackage.InterfaceC6795l
    public final void yandex(Object obj) throws IOException {
        InterfaceC6844l c12939l;
        int i = this.f31698l;
        Object obj2 = this.f31699l;
        AbstractC9453l abstractC9453l = this.f31697l;
        switch (i) {
            case 0:
                ((AbstractC12216l) obj).crashlytics(((C14829l) abstractC9453l).f29028l, new C15053l((Status) obj2));
                break;
            default:
                C17178l c17178l = (C17178l) obj;
                String str = ((C16257l) abstractC9453l).f31817l;
                C10815l c10815l = (C10815l) obj2;
                int i2 = c17178l.yandex;
                AbstractC11801l abstractC11801l = c17178l.loadAd;
                switch (i2) {
                    case 0:
                        C18014l c18014l = (C18014l) abstractC11801l;
                        int i3 = c10815l.loadAd;
                        if (i3 != 1) {
                            if (i3 == 3) {
                                c18014l.m4461try(C10126l.yandex);
                                C18730l c18730l = c18014l.f35207l;
                                long j = c10815l.yandex;
                                VKXApplication vKXApplication = VKXApplication.f36631l;
                                if (vKXApplication == null) {
                                    vKXApplication = null;
                                }
                                C16552l c16552l = AbstractC11463l.yandex;
                                c18730l.subs(j, AbstractC10999l.mopub(vKXApplication, ExecutorC6708l.f14063l, 0, new C12970l(c10815l, c18014l, str, null), 2));
                            }
                            break;
                        } else {
                            C9385l c9385l = AbstractC2617l.yandex;
                            byte[] bArr = c10815l.crashlytics;
                            if (bArr != null) {
                                c9385l.getClass();
                                InterfaceC17709l interfaceC17709l = (InterfaceC17709l) c9385l.yandex(InterfaceC17709l.Companion.serializer(), bArr);
                                if (!(interfaceC17709l instanceof C2895l)) {
                                    C18725l.billing();
                                } else {
                                    C2895l c2895l = (C2895l) interfaceC17709l;
                                    String str2 = c2895l.loadAd;
                                    if (c2895l.yandex == 100136 && AbstractC8576l.yandex(str2, "8.14.1_pub")) {
                                        C8688l c8688l = AbstractC0085l.yandex;
                                        AbstractC0085l abstractC0085lLoadAd = AbstractC8182l.loadAd();
                                        C8195l c8195lPremium = abstractC0085lLoadAd instanceof C2659l ? AbstractC5941l.premium(c18014l.isVip(), ((C2659l) abstractC0085lLoadAd).loadAd().getAbsolutePath()) : AbstractC5941l.inmobi(c18014l.isVip());
                                        Object obj3 = c8195lPremium.f17097l;
                                        Object obj4 = c8195lPremium.f17098l;
                                        long j2 = c2895l.amazon + 536870912;
                                        boolean zBooleanValue = ((Boolean) ((C7549l) AbstractC16584l.yandex().billing.admob).f15551l.getValue()).booleanValue();
                                        Number number = (Number) obj4;
                                        if (number.longValue() - j2 > 0 && zBooleanValue) {
                                            C12382l c12382l = AbstractC5921l.f12465l;
                                            String str3 = C14025l.f27330l;
                                            c12382l.ads(C6162l.ads(abstractC0085lLoadAd.crashlytics()));
                                            abstractC0085lLoadAd.crashlytics().mkdirs();
                                            c18014l.f35202l.subs(0);
                                            c18014l.f35201l.subs(c2895l.crashlytics);
                                            c18014l.m4460this(str, C8709l.INSTANCE);
                                        } else {
                                            Number number2 = (Number) obj3;
                                            c18014l.m4461try(new C14598l(number.longValue(), number2.longValue(), j2));
                                            c18014l.m4460this(str, new C0679l(number2.longValue(), number.longValue(), j2));
                                        }
                                    } else {
                                        c18014l.m4461try(new C17580l(str2));
                                        c18014l.m4460this(str, new C9323l());
                                    }
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        C7044l c7044l = (C7044l) abstractC11801l;
                        if (c10815l.loadAd == 1) {
                            C9385l c9385l2 = AbstractC2617l.yandex;
                            byte[] bArr2 = c10815l.crashlytics;
                            if (bArr2 != null) {
                                c9385l2.getClass();
                                InterfaceC3997l interfaceC3997l = (InterfaceC3997l) c9385l2.yandex(InterfaceC3997l.Companion.serializer(), bArr2);
                                if (AbstractC8576l.yandex(interfaceC3997l, C8709l.INSTANCE)) {
                                    String str4 = C14025l.f27330l;
                                    C8688l c8688l2 = AbstractC0085l.yandex;
                                    C14025l c14025lAds = C6162l.ads(AbstractC8182l.loadAd().loadAd());
                                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                                    ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
                                    C7167l c7167l = new C7167l(new C0328l(autoCloseOutputStream, new C3446l()));
                                    C12382l c12382l2 = AbstractC5921l.f12465l;
                                    AbstractC2991l.billing("CdcmSnd", 3, "[initiateTransferAfterHandshake] from " + c14025lAds, null);
                                    c7044l.m2160finally(C15228l.yandex);
                                    C1062l c1062lM2163public = c7044l.m2163public();
                                    C6490l c6490l = C10815l.subs;
                                    AbstractC1051l.isPro(parcelFileDescriptor, "Cannot create Payload.Stream from null ParcelFileDescriptor.");
                                    c1062lM2163public.admob(str, new C10815l(UUID.randomUUID().getLeastSignificantBits(), 3, null, null, new C2494l(parcelFileDescriptor)));
                                    VKXApplication vKXApplication2 = VKXApplication.f36631l;
                                    VKXApplication vKXApplication3 = vKXApplication2 != null ? vKXApplication2 : null;
                                    C16552l c16552l2 = AbstractC11463l.yandex;
                                    c7044l.f14765l = AbstractC10999l.mopub(vKXApplication3, ExecutorC6708l.f14063l, 0, new C4103l(c7167l, autoCloseOutputStream, c12382l2, c14025lAds, c7044l, null), 2);
                                } else if (interfaceC3997l instanceof C0679l) {
                                    c7044l.m2160finally(C17557l.yandex);
                                    C1062l c1062lM2163public2 = c7044l.m2163public();
                                    c1062lM2163public2.getClass();
                                    C2231l c2231l = new C2231l(str);
                                    C10147l c10147lYandex = C8662l.yandex();
                                    c10147lYandex.purchase = 1229;
                                    c10147lYandex.yandex = new C15714l(c2231l);
                                    c1062lM2163public2.purchase(1, c10147lYandex.yandex());
                                    c1062lM2163public2.firebase(str);
                                } else if (interfaceC3997l instanceof C9323l) {
                                    c7044l.m2160finally(new C2493l(((C9323l) interfaceC3997l).yandex));
                                    C1062l c1062lM2163public3 = c7044l.m2163public();
                                    c1062lM2163public3.getClass();
                                    C2231l c2231l2 = new C2231l(str);
                                    C10147l c10147lYandex2 = C8662l.yandex();
                                    c10147lYandex2.purchase = 1229;
                                    c10147lYandex2.yandex = new C15714l(c2231l2);
                                    c1062lM2163public3.purchase(1, c10147lYandex2.yandex());
                                    c1062lM2163public3.firebase(str);
                                } else if (!(interfaceC3997l instanceof C14614l)) {
                                    C18725l.billing();
                                } else {
                                    int iOrdinal = ((C14614l) interfaceC3997l).yandex.ordinal();
                                    if (iOrdinal == 0) {
                                        c12939l = C17710l.yandex;
                                    } else if (iOrdinal == 1) {
                                        c12939l = new C12939l(3);
                                    } else if (iOrdinal != 2) {
                                        C18725l.billing();
                                    } else {
                                        c12939l = new C12939l(4);
                                    }
                                    c7044l.m2160finally(c12939l);
                                    C1062l c1062lM2163public4 = c7044l.m2163public();
                                    c1062lM2163public4.getClass();
                                    C2231l c2231l3 = new C2231l(str);
                                    C10147l c10147lYandex3 = C8662l.yandex();
                                    c10147lYandex3.purchase = 1229;
                                    c10147lYandex3.yandex = new C15714l(c2231l3);
                                    c1062lM2163public4.purchase(1, c10147lYandex3.yandex());
                                    c1062lM2163public4.firebase(str);
                                }
                                break;
                            }
                        }
                        break;
                }
                break;
        }
    }
}
