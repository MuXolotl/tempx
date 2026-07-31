package defpackage;

import android.content.Context;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkapi2.objects.music.AudioSnippetEntry;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍؘٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9572l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f19507l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f19508l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f19509l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19510l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f19511l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f19512l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f19513l;

    public /* synthetic */ C9572l(C13939l c13939l, Function0 function0, Function0 function1, boolean z, Function0 function2, Function0 function3) {
        this.f19507l = c13939l;
        this.f19512l = function0;
        this.f19511l = function1;
        this.f19509l = z;
        this.f19513l = function2;
        this.f19508l = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws IOException {
        boolean z;
        int i = this.f19510l;
        C13863l c13863l = C1867l.yandex;
        C4346l c4346l = C4346l.f8873l;
        Object obj4 = this.f19508l;
        Object obj5 = this.f19513l;
        Object obj6 = this.f19511l;
        Object obj7 = this.f19512l;
        Object obj8 = this.f19507l;
        switch (i) {
            case 0:
                AudioTrack audioTrack = (AudioTrack) obj8;
                final C2887l c2887l = (C2887l) obj7;
                final AudioSnippetEntry audioSnippetEntry = (AudioSnippetEntry) obj6;
                C7721l c7721l = (C7721l) obj5;
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) obj4;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                    InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(c4346l, 1.0f);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j = c6956l.f14595continue;
                    int i2 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lCrashlytics);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l.m2140super();
                    if (c6956l.f14603switch) {
                        c6956l.firebase(c16395l);
                    } else {
                        c6956l.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
                    Integer numValueOf = Integer.valueOf(i2);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
                    C10707l c10707l = AbstractC1242l.loadAd;
                    C9477l c9477l = new C9477l((Context) c6956l.isPro(c10707l));
                    c9477l.crashlytics = audioTrack;
                    AbstractC10413l.yandex(c9477l, true);
                    AbstractC12872l.crashlytics(c9477l, new C14074l((Context) c6956l.isPro(c10707l), 2.0f));
                    c9477l.ads = 1;
                    c9477l.crashlytics(135);
                    AbstractC12872l.yandex(c9477l, false);
                    AbstractC18037l.crashlytics(c9477l.yandex(), null, AbstractC0532l.subs(750, 6, null), "", AbstractC14205l.crashlytics, c6956l, 28032, 2);
                    C6956l c6956l2 = c6956l;
                    InterfaceC12244l interfaceC12244l2 = interfaceC12244l;
                    C7721l c7721l2 = c7721l;
                    AbstractC9383l.yandex(AbstractC4927l.amazon(AbstractC0080l.crashlytics(c4346l, 1.0f), C9735l.loadAd(0.35f, C9735l.loadAd), AbstractC16837l.yandex), c6956l2, 6);
                    InterfaceC17242l interfaceC17242lCrashlytics2 = AbstractC0080l.crashlytics(c4346l, 1.0f);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l2, 0);
                    long j2 = c6956l2.f14595continue;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lCrashlytics2);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
                    AbstractC11043l.isPro(i3, c6956l2, c6415l3, c6956l2, c11192l);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
                    C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f);
                    C5062l c5062lYandex = AbstractC7001l.yandex(c7537l, C18450l.f36044l, c6956l2, 6);
                    long j3 = c6956l2.f14595continue;
                    int i4 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l2, interfaceC17242lSmaato);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c5062lYandex, c6415l);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato3, c6415l2);
                    AbstractC11043l.isPro(i4, c6956l2, c6415l3, c6956l2, c11192l);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling3, c6415l4);
                    c6956l2.m2123default(1613859822);
                    int size = audioSnippetEntry.mopub.size();
                    final int i5 = 0;
                    while (true) {
                        final boolean z2 = this.f19509l;
                        if (i5 < size) {
                            InterfaceC17242l interfaceC17242lPurchase = AbstractC0080l.purchase(new C9247l(1.0f, true), 1.0f);
                            long j4 = C9735l.purchase;
                            long jLoadAd = C9735l.loadAd(0.25f, j4);
                            final C7721l c7721l3 = c7721l2;
                            final InterfaceC12244l interfaceC12244l3 = interfaceC12244l2;
                            boolean zMopub = c6956l2.mopub(z2) | c6956l2.amazon(i5) | c6956l2.admob(c7721l3) | c6956l2.billing(interfaceC12244l3);
                            Object objM2132native = c6956l2.m2132native();
                            if (zMopub || objM2132native == c13863l) {
                                objM2132native = new Function0() { // from class: lؘٝۙ
                                    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        float fFloatValue;
                                        C15308l c15308l = c7721l3.f16199l;
                                        if (z2) {
                                            int iAdmob = c15308l.admob();
                                            int i6 = i5;
                                            if (i6 < iAdmob) {
                                                fFloatValue = 1.0f;
                                            } else if (i6 == c15308l.admob()) {
                                                fFloatValue = ((Number) interfaceC12244l3.getValue()).floatValue();
                                            } else {
                                                fFloatValue = 0.0f;
                                            }
                                        } else {
                                            fFloatValue = 0.0f;
                                        }
                                        return Float.valueOf(fFloatValue);
                                    }
                                };
                                c6956l2.m2147try(objM2132native);
                            }
                            Function0 function0 = (Function0) objM2132native;
                            Object objM2132native2 = c6956l2.m2132native();
                            if (objM2132native2 == c13863l) {
                                objM2132native2 = new C10351l(0);
                                c6956l2.m2147try(objM2132native2);
                            }
                            C6956l c6956l3 = c6956l2;
                            AbstractC4332l.loadAd(function0, interfaceC17242lPurchase, j4, jLoadAd, 1, 0.0f, (Function1) objM2132native2, c6956l3, 1772928, 0);
                            c6956l2 = c6956l3;
                            i5++;
                            c7721l2 = c7721l3;
                            interfaceC12244l2 = interfaceC12244l3;
                        } else {
                            final C7721l c7721l4 = c7721l2;
                            c6956l2.startapp(false);
                            c6956l2.startapp(true);
                            C6956l c6956l4 = c6956l2;
                            AbstractC7252l.yandex(c2887l, AbstractC0080l.amazon(c4346l, 1.0f).premium(new C9247l(1.0f, true)), new C17253l(32.0f, 16.0f, 32.0f, 16.0f), null, 0.0f, C18450l.f36040l, null, false, null, null, null, AbstractC14566l.amazon(444722787, new Function4() { // from class: lَُٛ
                                @Override // kotlin.jvm.functions.Function4
                                public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                                    int iIntValue2 = ((Integer) obj10).intValue();
                                    int iIntValue3 = ((Integer) obj12).intValue();
                                    AudioTrack audioTrack2 = (AudioTrack) audioSnippetEntry.mopub.get(iIntValue2);
                                    InterfaceC17242l interfaceC17242lCrashlytics3 = AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f);
                                    c7721l4.m2204abstract(audioTrack2, c2887l, iIntValue2, z2, interfaceC17242lCrashlytics3, (C6956l) obj11, ((iIntValue3 << 3) & 896) | 24576);
                                    return Unit.INSTANCE;
                                }
                            }, c6956l2), c6956l4, 1769472, 24576, 16280);
                            C6956l c6956l5 = c6956l4;
                            if (AbstractC8576l.yandex(audioSnippetEntry.yandex, "_playlist_mix")) {
                                z = false;
                                c6956l5.m2123default(1866169278);
                            } else {
                                c6956l5.m2123default(1881945674);
                                InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(AbstractC0019l.crashlytics(c4346l, ((C14370l) c6956l5.isPro(AbstractC16964l.yandex)).crashlytics.crashlytics), 1.0f);
                                boolean zAdmob = c6956l5.admob(audioSnippetEntry) | c6956l5.admob(c7721l4);
                                Object objM2132native3 = c6956l5.m2132native();
                                if (zAdmob || objM2132native3 == c13863l) {
                                    objM2132native3 = new Ctry(audioSnippetEntry, c7721l4, 13);
                                    c6956l5.m2147try(objM2132native3);
                                }
                                final int i6 = 0;
                                InterfaceC17242l interfaceC17242lLoadAd = AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native3, 15);
                                int i7 = AbstractC15548l.yandex;
                                final int i8 = 1;
                                final int i9 = 2;
                                AbstractC13319l.yandex(AbstractC14566l.amazon(1125930411, new Function2() { // from class: lِٖٗ
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj9, Object obj10) {
                                        int i10 = i6;
                                        AudioSnippetEntry audioSnippetEntry2 = audioSnippetEntry;
                                        switch (i10) {
                                            case 0:
                                                C6956l c6956l6 = (C6956l) obj9;
                                                int iIntValue2 = ((Integer) obj10).intValue();
                                                if (c6956l6.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    AbstractC13010l.loadAd(audioSnippetEntry2.loadAd, null, C9735l.purchase, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l6, 384, 24960, 241658);
                                                } else {
                                                    c6956l6.m2124else();
                                                }
                                                break;
                                            case 1:
                                                C6956l c6956l7 = (C6956l) obj9;
                                                int iIntValue3 = ((Integer) obj10).intValue();
                                                if (c6956l7.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    AbstractC13010l.loadAd(audioSnippetEntry2.crashlytics, null, C9735l.loadAd(0.75f, C9735l.purchase), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l7, 384, 24960, 241658);
                                                } else {
                                                    c6956l7.m2124else();
                                                }
                                                break;
                                            default:
                                                C6956l c6956l8 = (C6956l) obj9;
                                                int iIntValue4 = ((Integer) obj10).intValue();
                                                if (c6956l8.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    String str = audioSnippetEntry2.purchase;
                                                    C10707l c10707l2 = AbstractC16964l.yandex;
                                                    AbstractC7741l.purchase(str, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(C4346l.f8873l, 38.0f), ((C14370l) c6956l8.isPro(c10707l2)).crashlytics.crashlytics), new C18627l(((C14370l) c6956l8.isPro(c10707l2)).yandex.startapp), new C18627l(((C14370l) c6956l8.isPro(c10707l2)).yandex.startapp), null, c6956l8, 36912, 0, 32736);
                                                } else {
                                                    c6956l8.m2124else();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, c6956l5), interfaceC17242lLoadAd, null, AbstractC14566l.amazon(1093334024, new Function2() { // from class: lِٖٗ
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj9, Object obj10) {
                                        int i10 = i8;
                                        AudioSnippetEntry audioSnippetEntry2 = audioSnippetEntry;
                                        switch (i10) {
                                            case 0:
                                                C6956l c6956l6 = (C6956l) obj9;
                                                int iIntValue2 = ((Integer) obj10).intValue();
                                                if (c6956l6.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    AbstractC13010l.loadAd(audioSnippetEntry2.loadAd, null, C9735l.purchase, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l6, 384, 24960, 241658);
                                                } else {
                                                    c6956l6.m2124else();
                                                }
                                                break;
                                            case 1:
                                                C6956l c6956l7 = (C6956l) obj9;
                                                int iIntValue3 = ((Integer) obj10).intValue();
                                                if (c6956l7.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    AbstractC13010l.loadAd(audioSnippetEntry2.crashlytics, null, C9735l.loadAd(0.75f, C9735l.purchase), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l7, 384, 24960, 241658);
                                                } else {
                                                    c6956l7.m2124else();
                                                }
                                                break;
                                            default:
                                                C6956l c6956l8 = (C6956l) obj9;
                                                int iIntValue4 = ((Integer) obj10).intValue();
                                                if (c6956l8.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    String str = audioSnippetEntry2.purchase;
                                                    C10707l c10707l2 = AbstractC16964l.yandex;
                                                    AbstractC7741l.purchase(str, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(C4346l.f8873l, 38.0f), ((C14370l) c6956l8.isPro(c10707l2)).crashlytics.crashlytics), new C18627l(((C14370l) c6956l8.isPro(c10707l2)).yandex.startapp), new C18627l(((C14370l) c6956l8.isPro(c10707l2)).yandex.startapp), null, c6956l8, 36912, 0, 32736);
                                                } else {
                                                    c6956l8.m2124else();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, c6956l5), AbstractC14566l.amazon(-1780842969, new Function2() { // from class: lِٖٗ
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj9, Object obj10) {
                                        int i10 = i9;
                                        AudioSnippetEntry audioSnippetEntry2 = audioSnippetEntry;
                                        switch (i10) {
                                            case 0:
                                                C6956l c6956l6 = (C6956l) obj9;
                                                int iIntValue2 = ((Integer) obj10).intValue();
                                                if (c6956l6.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    AbstractC13010l.loadAd(audioSnippetEntry2.loadAd, null, C9735l.purchase, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l6, 384, 24960, 241658);
                                                } else {
                                                    c6956l6.m2124else();
                                                }
                                                break;
                                            case 1:
                                                C6956l c6956l7 = (C6956l) obj9;
                                                int iIntValue3 = ((Integer) obj10).intValue();
                                                if (c6956l7.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    AbstractC13010l.loadAd(audioSnippetEntry2.crashlytics, null, C9735l.loadAd(0.75f, C9735l.purchase), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c6956l7, 384, 24960, 241658);
                                                } else {
                                                    c6956l7.m2124else();
                                                }
                                                break;
                                            default:
                                                C6956l c6956l8 = (C6956l) obj9;
                                                int iIntValue4 = ((Integer) obj10).intValue();
                                                if (c6956l8.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                                    String str = audioSnippetEntry2.purchase;
                                                    C10707l c10707l2 = AbstractC16964l.yandex;
                                                    AbstractC7741l.purchase(str, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(C4346l.f8873l, 38.0f), ((C14370l) c6956l8.isPro(c10707l2)).crashlytics.crashlytics), new C18627l(((C14370l) c6956l8.isPro(c10707l2)).yandex.startapp), new C18627l(((C14370l) c6956l8.isPro(c10707l2)).yandex.startapp), null, c6956l8, 36912, 0, 32736);
                                                } else {
                                                    c6956l8.m2124else();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, c6956l5), AbstractC14205l.amazon, AbstractC15548l.yandex(C9735l.loadAd(0.25f, C9735l.purchase), 0L, 0L, 0L, c6956l5, 510), c6956l5, 224262, 388);
                                c6956l5 = c6956l5;
                                z = false;
                            }
                            c6956l5.startapp(z);
                            c6956l5.startapp(true);
                            c6956l5.startapp(true);
                        }
                    }
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                C13939l c13939l = (C13939l) obj8;
                Function0 function1 = (Function0) obj7;
                Function0 function2 = (Function0) obj6;
                Function0 function3 = (Function0) obj5;
                Function0 function4 = (Function0) obj4;
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (c6956l6.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    String strPurchase = AbstractC11999l.purchase(c6956l6, R.string.as2_scenario_add);
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, AbstractC3605l.startapp(AbstractC0080l.amazon(c4346l, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7), ((C14370l) c6956l6.isPro(c10707l2)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l6.isPro(c10707l2)).loadAd.purchase, c6956l6, 48, 0, 130040);
                    boolean zAdmob2 = c6956l6.admob(c13939l) | c6956l6.billing(function1) | c6956l6.billing(function2);
                    boolean z3 = this.f19509l;
                    boolean zMopub2 = zAdmob2 | c6956l6.mopub(z3) | c6956l6.billing(function3) | c6956l6.billing(function4);
                    Object objM2132native4 = c6956l6.m2132native();
                    if (zMopub2 || objM2132native4 == c13863l) {
                        C1170l c1170l = new C1170l(c13939l, function1, function2, z3, function3, function4);
                        c6956l6.m2147try(c1170l);
                        objM2132native4 = c1170l;
                    }
                    AbstractC16336l.yandex(null, null, null, null, null, null, false, null, (Function1) objM2132native4, c6956l6, 0, 511);
                } else {
                    c6956l6.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C9572l(AudioTrack audioTrack, C2887l c2887l, AudioSnippetEntry audioSnippetEntry, C7721l c7721l, boolean z, InterfaceC8714l interfaceC8714l) {
        this.f19507l = audioTrack;
        this.f19512l = c2887l;
        this.f19511l = audioSnippetEntry;
        this.f19513l = c7721l;
        this.f19509l = z;
        this.f19508l = interfaceC8714l;
    }
}
