package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lِّ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11798l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C11249l f23619l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23620l = 0;

    public /* synthetic */ C11798l(C11249l c11249l) {
        this.f23619l = c11249l;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C6956l c6956l;
        switch (this.f23620l) {
            case 0:
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float fYandex = ((C15700l) c6956l2.isPro(AbstractC18678l.yandex)).yandex(c6956l2) + 16.0f;
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(c4346l, 0.0f, 0.0f, 0.0f, fYandex, 7);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36034l, c6956l2, 48);
                    long j = c6956l2.f14595continue;
                    int i = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lStartapp);
                    InterfaceC8801l.firebase.getClass();
                    Function0 function0 = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(function0);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                    C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l2, 196608, 31);
                    C11249l c11249l = this.f23619l;
                    AbstractC18643l abstractC18643l = c11249l.f22672l;
                    AudioTrack audioTrack = abstractC18643l instanceof AudioTrack ? (AudioTrack) abstractC18643l : null;
                    String strPurchase = AbstractC11999l.purchase(c6956l2, (audioTrack == null || audioTrack.purchase() != 2) ? R.string.lyrics : R.string.lyrics_podcast);
                    AbstractC5189l abstractC5189l = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l2.isPro(abstractC5189l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(abstractC5189l)).loadAd.purchase, c6956l2, 48, 0, 130040);
                    C6956l c6956l3 = c6956l2;
                    AbstractC9334l.yandex(c6956l3, AbstractC0080l.purchase(c4346l, 16.0f));
                    Object obj3 = (InterfaceC0582l) c11249l.f22671l.getValue();
                    if (obj3 instanceof C6143l) {
                        c6956l3.m2123default(1450173692);
                        c11249l.pro((C6143l) obj3, AbstractC0080l.crashlytics(c4346l, 1.0f), c6956l3, 48);
                        c6956l3.startapp(false);
                        c6956l = c6956l3;
                    } else {
                        boolean z = obj3 instanceof C16016l;
                        Object obj4 = C1867l.yandex;
                        if (z) {
                            c6956l3.m2123default(1450432139);
                            C16016l c16016l = (C16016l) obj3;
                            c11249l.advert(c16016l, new C9247l(1.0f, true), c6956l3, 0);
                            AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l3, 0, 7);
                            InterfaceC17242l interfaceC17242lStartapp2 = AbstractC3605l.startapp(AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2), 0.0f, 16.0f, 0.0f, 0.0f, 13);
                            C17253l c17253l = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
                            C6839l c6839l = ((C14370l) c6956l3.isPro(abstractC5189l)).crashlytics.crashlytics;
                            boolean zBilling = c6956l3.billing(obj3) | c6956l3.admob(c11249l);
                            Object objM2132native = c6956l3.m2132native();
                            if (zBilling || objM2132native == obj4) {
                                objM2132native = new C9810l(c16016l, c11249l, 8);
                                c6956l3.m2147try(objM2132native);
                            }
                            AbstractC17457l.loadAd((Function0) objM2132native, interfaceC17242lStartapp2, false, c6839l, null, null, null, c17253l, AbstractC5646l.yandex, c6956l3, 817889328, 372);
                            C6956l c6956l4 = c6956l3;
                            c6956l4.startapp(false);
                            c6956l = c6956l4;
                        } else if (AbstractC8576l.yandex(obj3, C10760l.INSTANCE)) {
                            c6956l3.m2123default(1451451760);
                            c11249l.ad(AbstractC0080l.crashlytics(c4346l, 1.0f), AbstractC16759l.crashlytics(R.drawable.ic_globe_outline_28, 0, c6956l3), AbstractC11999l.purchase(c6956l3, R.string.error_occurred), c6956l3, 70);
                            c6956l3.startapp(false);
                            c6956l = c6956l3;
                        } else if (AbstractC8576l.yandex(obj3, C6884l.INSTANCE)) {
                            c6956l3.m2123default(1451817963);
                            c11249l.ad(AbstractC0080l.crashlytics(c4346l, 1.0f), AbstractC16759l.crashlytics(R.drawable.ic_clear_data_outline_28, 0, c6956l3), AbstractC11999l.purchase(c6956l3, R.string.lrc_not_found), c6956l3, 70);
                            c6956l3.startapp(false);
                            c6956l = c6956l3;
                        } else {
                            if (obj3 != null) {
                                throw AbstractC12900l.billing(1709347258, c6956l3, false);
                            }
                            c6956l3.m2123default(1452199976);
                            Unit unit = Unit.INSTANCE;
                            boolean zAdmob = c6956l3.admob(c11249l);
                            Object objM2132native2 = c6956l3.m2132native();
                            if (zAdmob || objM2132native2 == obj4) {
                                objM2132native2 = new C15559l(c11249l, null, 28);
                                c6956l3.m2147try(objM2132native2);
                            }
                            AbstractC12311l.amazon(c6956l3, unit, (Function2) objM2132native2);
                            AbstractC7209l.yandex(c4346l, false, 0L, c6956l3, 6, 6);
                            c6956l3.startapp(false);
                            c6956l = c6956l3;
                        }
                    }
                    c6956l.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                this.f23619l.license((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C11798l(C11249l c11249l, int i) {
        this.f23619l = c11249l;
    }
}
