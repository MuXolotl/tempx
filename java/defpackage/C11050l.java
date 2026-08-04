package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.vkapi2.objects.music.AudioSnippetEntry;
import ua.itaysonlab.vkapi2.objects.music.AudioStreamMix;

/* JADX INFO: renamed from: lُٔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11050l implements Function4 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f22246l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f22247l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22248l;

    public /* synthetic */ C11050l(Object obj, Object obj2, int i) {
        this.f22248l = i;
        this.f22247l = obj;
        this.f22246l = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v50 */
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
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        Object obj5;
        Object obj6;
        boolean z2;
        Object obj7;
        Object obj8;
        Object obj9;
        boolean z3;
        Object obj10;
        ?? r6;
        Object obj11;
        Object obj12;
        String str;
        Object obj13;
        int i = this.f22248l;
        int i2 = 3;
        int i3 = 6;
        C4346l c4346l = C4346l.f8873l;
        Object obj14 = C1867l.yandex;
        Object obj15 = this.f22246l;
        Object obj16 = this.f22247l;
        switch (i) {
            case 0:
                C14267l c14267l = (C14267l) obj16;
                C9879l c9879l = ((C0483l) obj15).yandex;
                C6956l c6956l = (C6956l) obj3;
                ((Integer) obj4).getClass();
                boolean z4 = c14267l.crashlytics == EnumC11447l.f23032l;
                String str2 = c14267l.yandex.yandex;
                C6678l c6678l = (C6678l) c9879l.isPro.getValue();
                C7119l c7119l = c9879l.smaato;
                String str3 = c14267l.amazon;
                boolean zAdmob = c6956l.admob(c9879l);
                Object objM2132native = c6956l.m2132native();
                if (zAdmob || objM2132native == obj14) {
                    Object c2176l = new C2176l(1, c9879l, C9879l.class, "onTrackClickedInQueue", "onTrackClickedInQueue(Lbruhcollective/itaysonlab/playback/PlaybackItem;)V", 0, 0, 7);
                    c6956l.m2147try(c2176l);
                    objM2132native = c2176l;
                }
                Function1 function1 = (Function1) ((InterfaceC5059l) objM2132native);
                boolean zAdmob2 = c6956l.admob(c9879l);
                Object objM2132native2 = c6956l.m2132native();
                if (zAdmob2 || objM2132native2 == obj14) {
                    Object c2176l2 = new C2176l(1, c9879l, C9879l.class, "onTrackMenuClickedInQueue", "onTrackMenuClickedInQueue(Lbruhcollective/itaysonlab/playback/PlaybackItem;)V", 0, 0, 8);
                    c6956l.m2147try(c2176l2);
                    objM2132native2 = c2176l2;
                }
                Function1 function2 = (Function1) ((InterfaceC5059l) objM2132native2);
                boolean zAdmob3 = c6956l.admob(c9879l);
                Object objM2132native3 = c6956l.m2132native();
                if (zAdmob3 || objM2132native3 == obj14) {
                    Object c2176l3 = new C2176l(1, c9879l, C9879l.class, "onTrackDismissedFromQueue", "onTrackDismissedFromQueue(Lbruhcollective/itaysonlab/playback/PlaybackItem;)V", 0, 0, 9);
                    c6956l.m2147try(c2176l3);
                    objM2132native3 = c2176l3;
                }
                Function1 function3 = (Function1) ((InterfaceC5059l) objM2132native3);
                boolean zAdmob4 = c6956l.admob(c9879l);
                Object objM2132native4 = c6956l.m2132native();
                if (zAdmob4 || objM2132native4 == obj14) {
                    Object c14959l = new C14959l(2, c9879l, C9879l.class, "onTrackMovedFromQueue", "onTrackMovedFromQueue(II)V", 0, 0, 0);
                    c6956l.m2147try(c14959l);
                    objM2132native4 = c14959l;
                }
                Function2 function4 = (Function2) ((InterfaceC5059l) objM2132native4);
                boolean zAdmob5 = c6956l.admob(c9879l);
                Object objM2132native5 = c6956l.m2132native();
                if (zAdmob5 || objM2132native5 == obj14) {
                    objM2132native5 = new Cconst(0, c9879l, C9879l.class, "onCreatePlaylistFromQueueClicked", "onCreatePlaylistFromQueueClicked()V", 0, 0, 11);
                    c6956l.m2147try(objM2132native5);
                }
                AbstractC17948l.yandex(z4, str2, c6678l, c7119l, str3, function1, function2, function3, function4, (Function0) ((InterfaceC5059l) objM2132native5), AbstractC2697l.subscription(AbstractC3605l.startapp(AbstractC0080l.crashlytics(c4346l, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13), AbstractC2697l.amazon), c6956l, 0);
                return Unit.INSTANCE;
            case 1:
                C15578l c15578l = (C15578l) obj16;
                C15578l c15578l2 = (C15578l) obj15;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                C6956l c6956l2 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                if (zBooleanValue) {
                    c6956l2.m2123default(-1198121255);
                    c15578l.invoke(c6956l2, 0);
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2123default(-1198070570);
                    c15578l2.invoke(c6956l2, 0);
                    c6956l2.startapp(false);
                }
                return Unit.INSTANCE;
            case 2:
                C7721l c7721l = (C7721l) obj16;
                C2887l c2887l = (C2887l) obj15;
                int iIntValue = ((Integer) obj2).intValue();
                C6956l c6956l3 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                C11362l c11362l = c7721l.f16203l;
                if (iIntValue != c11362l.size()) {
                    c6956l3.m2123default(-570081909);
                    c7721l.m2206import(iIntValue == c2887l.metrica(), (AudioSnippetEntry) c11362l.get(iIntValue), c6956l3, 0);
                    c6956l3.startapp(false);
                } else {
                    c6956l3.m2123default(-569846960);
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
                    long j = c6956l3.f14595continue;
                    int i4 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l3.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, interfaceC17242lAmazon);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l3.m2140super();
                    if (c6956l3.f14603switch) {
                        c6956l3.firebase(c16395l);
                    } else {
                        c6956l3.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l3, interfaceC10835lAmazon, C3438l.mopub);
                    AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l3, Integer.valueOf(i4), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l3, C3438l.firebase);
                    AbstractC8182l.billing(c6956l3, interfaceC17242lBilling, C3438l.amazon);
                    AbstractC8960l.loadAd(null, 0L, null, c6956l3, 0, 7);
                    c6956l3.startapp(true);
                    c6956l3.startapp(false);
                }
                return Unit.INSTANCE;
            case 3:
                C18014l c18014l = (C18014l) obj15;
                InterfaceC13779l interfaceC13779l = (InterfaceC13779l) obj2;
                C6956l c6956l4 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                InterfaceC17242l interfaceC17242lFirebase = AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), (InterfaceC11780l) obj16);
                InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36043l, false);
                long j2 = c6956l4.f14595continue;
                int i5 = (int) (j2 ^ (j2 >>> 32));
                InterfaceC18556l interfaceC18556lSmaato2 = c6956l4.smaato();
                InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l4, interfaceC17242lFirebase);
                InterfaceC8801l.firebase.getClass();
                Function0 function0 = C3438l.loadAd;
                c6956l4.m2140super();
                if (c6956l4.f14603switch) {
                    c6956l4.firebase(function0);
                } else {
                    c6956l4.m2136protected();
                }
                AbstractC8182l.billing(c6956l4, interfaceC10835lAmazon2, C3438l.mopub);
                AbstractC8182l.billing(c6956l4, interfaceC18556lSmaato2, C3438l.billing);
                AbstractC8182l.billing(c6956l4, Integer.valueOf(i5), C3438l.isPro);
                AbstractC8182l.purchase(c6956l4, C3438l.firebase);
                AbstractC8182l.billing(c6956l4, interfaceC17242lBilling2, C3438l.amazon);
                if (interfaceC13779l.equals(C9301l.yandex)) {
                    c6956l4.m2123default(31764520);
                    AbstractC14289l.amazon(AbstractC11028l.crashlytics, c6956l4, 6);
                    c6956l4.startapp(false);
                } else if (interfaceC13779l instanceof C14391l) {
                    c6956l4.m2123default(31913754);
                    Exception exc = ((C14391l) interfaceC13779l).yandex;
                    boolean zAdmob6 = c6956l4.admob(c18014l);
                    Object objM2132native6 = c6956l4.m2132native();
                    if (zAdmob6 || objM2132native6 == obj14) {
                        objM2132native6 = new C2944l(0, c18014l, C18014l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 22);
                        c6956l4.m2147try(objM2132native6);
                    }
                    AbstractC14289l.crashlytics(exc, (Function0) ((InterfaceC5059l) objM2132native6), c6956l4, 0);
                    c6956l4.startapp(false);
                } else if (interfaceC13779l.equals(C9022l.yandex)) {
                    c6956l4.m2123default(32213648);
                    AbstractC14289l.amazon(AbstractC11028l.amazon, c6956l4, 6);
                    c6956l4.startapp(false);
                } else if (interfaceC13779l.equals(C10126l.yandex)) {
                    c6956l4.m2123default(32465492);
                    AbstractC14289l.purchase(c18014l.f35202l.admob(), c18014l.f35201l.admob(), true, c6956l4, 384);
                    c6956l4.startapp(false);
                } else if (interfaceC13779l instanceof C6077l) {
                    c6956l4.m2123default(32808631);
                    boolean zAdmob7 = c6956l4.admob(c18014l);
                    Object objM2132native7 = c6956l4.m2132native();
                    if (zAdmob7 || objM2132native7 == obj14) {
                        objM2132native7 = new C2944l(0, c18014l, C18014l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 23);
                        c6956l4.m2147try(objM2132native7);
                    }
                    AbstractC14289l.loadAd(5, (Function0) ((InterfaceC5059l) objM2132native7), c6956l4, 0);
                    c6956l4.startapp(false);
                } else {
                    if (!(interfaceC13779l instanceof C14598l)) {
                        if (interfaceC13779l instanceof C17580l) {
                            c6956l4.m2123default(33446673);
                            String str4 = ((C17580l) interfaceC13779l).yandex;
                            boolean zAdmob8 = c6956l4.admob(c18014l);
                            Object objM2132native8 = c6956l4.m2132native();
                            if (zAdmob8 || objM2132native8 == obj14) {
                                obj6 = objM2132native8;
                                Object c7787l = new C7787l(c18014l, 0);
                                c6956l4.m2147try(c7787l);
                                obj6 = c7787l;
                            }
                            Function0 function5 = (Function0) obj6;
                            boolean zAdmob9 = c6956l4.admob(c18014l);
                            Object objM2132native9 = c6956l4.m2132native();
                            if (zAdmob9 || objM2132native9 == obj14) {
                                objM2132native9 = new C2944l(0, c18014l, C18014l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 25);
                                c6956l4.m2147try(objM2132native9);
                            }
                            AbstractC14289l.billing(str4, function5, (Function0) ((InterfaceC5059l) objM2132native9), c6956l4, 6);
                            c6956l4.startapp(false);
                        } else {
                            if (!interfaceC13779l.equals(C9388l.yandex)) {
                                throw AbstractC12900l.billing(139572090, c6956l4, false);
                            }
                            c6956l4.m2123default(33909844);
                            boolean zAdmob10 = c6956l4.admob(c18014l);
                            Object objM2132native10 = c6956l4.m2132native();
                            if (zAdmob10 || objM2132native10 == obj14) {
                                z = true;
                                Object c7787l2 = new C7787l(c18014l, true ? 1 : 0);
                                c6956l4.m2147try(c7787l2);
                                obj5 = c7787l2;
                            } else {
                                z = true;
                                obj5 = objM2132native10;
                            }
                            c18014l.m4455abstract((Function0) obj5, c6956l4, 0);
                            c6956l4.startapp(false);
                        }
                        c6956l4.startapp(z);
                        return Unit.INSTANCE;
                    }
                    c6956l4.m2123default(33129884);
                    C14598l c14598l = (C14598l) interfaceC13779l;
                    boolean zAdmob11 = c6956l4.admob(c18014l);
                    Object objM2132native11 = c6956l4.m2132native();
                    if (zAdmob11 || objM2132native11 == obj14) {
                        objM2132native11 = new C2944l(0, c18014l, C18014l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 24);
                        c6956l4.m2147try(objM2132native11);
                    }
                    c18014l.m4457import(c14598l, (Function0) ((InterfaceC5059l) objM2132native11), c6956l4, 0);
                    c6956l4.startapp(false);
                }
                z = true;
                c6956l4.startapp(z);
                return Unit.INSTANCE;
            case 4:
                C7044l c7044l = (C7044l) obj15;
                InterfaceC6844l interfaceC6844l = (InterfaceC6844l) obj2;
                C6956l c6956l5 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                InterfaceC17242l interfaceC17242lFirebase2 = AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), (InterfaceC11780l) obj16);
                InterfaceC10835l interfaceC10835lAmazon3 = AbstractC9383l.amazon(C18450l.f36043l, false);
                long j3 = c6956l5.f14595continue;
                int i6 = (int) (j3 ^ (j3 >>> 32));
                InterfaceC18556l interfaceC18556lSmaato3 = c6956l5.smaato();
                InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l5, interfaceC17242lFirebase2);
                InterfaceC8801l.firebase.getClass();
                Function0 function6 = C3438l.loadAd;
                c6956l5.m2140super();
                if (c6956l5.f14603switch) {
                    c6956l5.firebase(function6);
                } else {
                    c6956l5.m2136protected();
                }
                AbstractC8182l.billing(c6956l5, interfaceC10835lAmazon3, C3438l.mopub);
                AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato3, C3438l.billing);
                AbstractC8182l.billing(c6956l5, Integer.valueOf(i6), C3438l.isPro);
                AbstractC8182l.purchase(c6956l5, C3438l.firebase);
                AbstractC8182l.billing(c6956l5, interfaceC17242lBilling3, C3438l.amazon);
                if (interfaceC6844l.equals(C14359l.yandex)) {
                    c6956l5.m2123default(228898798);
                    AbstractC14289l.amazon(C17423l.amazon, c6956l5, 6);
                    c6956l5.startapp(false);
                } else if (interfaceC6844l instanceof C4420l) {
                    c6956l5.m2123default(229045986);
                    Exception exc2 = ((C4420l) interfaceC6844l).yandex;
                    boolean zAdmob12 = c6956l5.admob(c7044l);
                    Object objM2132native12 = c6956l5.m2132native();
                    if (zAdmob12 || objM2132native12 == obj14) {
                        Object c2944l = new C2944l(0, c7044l, C7044l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 27);
                        c6956l5.m2147try(c2944l);
                        objM2132native12 = c2944l;
                    }
                    AbstractC14289l.crashlytics(exc2, (Function0) ((InterfaceC5059l) objM2132native12), c6956l5, 0);
                    c6956l5.startapp(false);
                } else if (interfaceC6844l.equals(C0632l.yandex)) {
                    c6956l5.m2123default(229352979);
                    if (c7044l.f14762l.isEmpty()) {
                        z3 = false;
                        c6956l5.m2123default(229506894);
                        AbstractC14289l.amazon(C17423l.purchase, c6956l5, 6);
                        c6956l5.startapp(false);
                    } else {
                        c6956l5.m2123default(229406082);
                        z3 = false;
                        c7044l.m2161import(c6956l5, 0);
                        c6956l5.startapp(false);
                    }
                    c6956l5.startapp(z3);
                } else if (interfaceC6844l.equals(C14214l.yandex)) {
                    c6956l5.m2123default(229878894);
                    AbstractC14289l.amazon(C17423l.billing, c6956l5, 6);
                    c6956l5.startapp(false);
                } else if (interfaceC6844l.equals(C17557l.yandex)) {
                    c6956l5.m2123default(230025555);
                    boolean zAdmob13 = c6956l5.admob(c7044l);
                    Object objM2132native13 = c6956l5.m2132native();
                    if (zAdmob13 || objM2132native13 == obj14) {
                        obj9 = objM2132native13;
                        Object c2944l2 = new C2944l(0, c7044l, C7044l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 28);
                        c6956l5.m2147try(c2944l2);
                        obj9 = c2944l2;
                    }
                    c7044l.m2159abstract((Function0) ((InterfaceC5059l) obj9), c6956l5, 0);
                    c6956l5.startapp(false);
                } else if (interfaceC6844l instanceof C2493l) {
                    c6956l5.m2123default(230295193);
                    String str5 = ((C2493l) interfaceC6844l).yandex;
                    boolean zAdmob14 = c6956l5.admob(c7044l);
                    Object objM2132native14 = c6956l5.m2132native();
                    if (zAdmob14 || objM2132native14 == obj14) {
                        obj8 = objM2132native14;
                        Object c1225l = new C1225l(c7044l, 0);
                        c6956l5.m2147try(c1225l);
                        obj8 = c1225l;
                    }
                    Function0 function7 = (Function0) obj8;
                    boolean zAdmob15 = c6956l5.admob(c7044l);
                    Object objM2132native15 = c6956l5.m2132native();
                    if (zAdmob15 || objM2132native15 == obj14) {
                        Object c2944l3 = new C2944l(0, c7044l, C7044l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 29);
                        c6956l5.m2147try(c2944l3);
                        objM2132native15 = c2944l3;
                    }
                    AbstractC14289l.billing(str5, function7, (Function0) ((InterfaceC5059l) objM2132native15), c6956l5, 6);
                    c6956l5.startapp(false);
                } else {
                    if (!interfaceC6844l.equals(C15228l.yandex)) {
                        if (interfaceC6844l instanceof C12939l) {
                            c6956l5.m2123default(231100573);
                            int i7 = ((C12939l) interfaceC6844l).yandex;
                            boolean zAdmob16 = c6956l5.admob(c7044l);
                            Object objM2132native16 = c6956l5.m2132native();
                            if (zAdmob16 || objM2132native16 == obj14) {
                                Object c6335l = new C6335l(0, c7044l, C7044l.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 0);
                                c6956l5.m2147try(c6335l);
                                objM2132native16 = c6335l;
                            }
                            AbstractC14289l.loadAd(i7, (Function0) ((InterfaceC5059l) objM2132native16), c6956l5, 0);
                            c6956l5.startapp(false);
                        } else {
                            if (!interfaceC6844l.equals(C17710l.yandex)) {
                                throw AbstractC12900l.billing(-131163073, c6956l5, false);
                            }
                            c6956l5.m2123default(231310970);
                            boolean zAdmob17 = c6956l5.admob(c7044l);
                            Object objM2132native17 = c6956l5.m2132native();
                            if (zAdmob17 || objM2132native17 == obj14) {
                                z2 = true;
                                Object c1225l2 = new C1225l(c7044l, true ? 1 : 0);
                                c6956l5.m2147try(c1225l2);
                                obj7 = c1225l2;
                            } else {
                                z2 = true;
                                obj7 = objM2132native17;
                            }
                            c7044l.m2162instanceof((Function0) obj7, c6956l5, 0);
                            c6956l5.startapp(false);
                        }
                        c6956l5.startapp(z2);
                        return Unit.INSTANCE;
                    }
                    c6956l5.m2123default(230759449);
                    AbstractC14289l.purchase(c7044l.f14758l.admob(), c7044l.f14767l.admob(), false, c6956l5, 384);
                    c6956l5.startapp(false);
                }
                z2 = true;
                c6956l5.startapp(z2);
                return Unit.INSTANCE;
            case 5:
                final C4456l c4456l = (C4456l) obj16;
                final InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj15;
                C6956l c6956l6 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                int iOrdinal = ((EnumC16462l) obj2).ordinal();
                if (iOrdinal == 0) {
                    c6956l6.m2123default(509521960);
                    c4456l.advert(c4456l.f9076l, c6956l6, 48);
                    c6956l6.startapp(false);
                } else if (iOrdinal == 1) {
                    c6956l6.m2123default(509768348);
                    boolean zAdmob18 = c6956l6.admob(c4456l);
                    Object objM2132native18 = c6956l6.m2132native();
                    if (zAdmob18 || objM2132native18 == obj14) {
                        obj10 = objM2132native18;
                        Object c3871l = new C3871l(c4456l, 5);
                        c6956l6.m2147try(c3871l);
                        obj10 = c3871l;
                    }
                    Function0 function8 = (Function0) obj10;
                    boolean zAdmob19 = c6956l6.admob(interfaceC2262l) | c6956l6.admob(c4456l);
                    Object objM2132native19 = c6956l6.m2132native();
                    if (zAdmob19 || objM2132native19 == obj14) {
                        r6 = 0;
                        final boolean z5 = false ? 1 : 0;
                        Object obj17 = new Function0() { // from class: lؕٔؖ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i8 = z5;
                                C4456l c4456l2 = c4456l;
                                InterfaceC2262l interfaceC2262l2 = interfaceC2262l;
                                switch (i8) {
                                    case 0:
                                        AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C10010l(c4456l2, null, 1), 3);
                                        break;
                                    default:
                                        AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C10010l(c4456l2, null, 2), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l6.m2147try(obj17);
                        obj11 = obj17;
                    } else {
                        r6 = 0;
                        obj11 = objM2132native19;
                    }
                    c4456l.applovin(function8, (Function0) obj11, c6956l6, r6);
                    c6956l6.startapp(r6);
                } else if (iOrdinal == 2) {
                    c6956l6.m2123default(510178509);
                    boolean zAdmob20 = c6956l6.admob(c4456l);
                    Object objM2132native20 = c6956l6.m2132native();
                    if (zAdmob20 || objM2132native20 == obj14) {
                        obj12 = objM2132native20;
                        Object c3871l2 = new C3871l(c4456l, 6);
                        c6956l6.m2147try(c3871l2);
                        obj12 = c3871l2;
                    }
                    Function0 function9 = (Function0) obj12;
                    boolean zAdmob21 = c6956l6.admob(interfaceC2262l) | c6956l6.admob(c4456l);
                    Object objM2132native21 = c6956l6.m2132native();
                    Object obj18 = objM2132native21;
                    if (zAdmob21 || objM2132native21 == obj14) {
                        final int i8 = 1;
                        Object obj19 = new Function0() { // from class: lؕٔؖ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i9 = i8;
                                C4456l c4456l2 = c4456l;
                                InterfaceC2262l interfaceC2262l2 = interfaceC2262l;
                                switch (i9) {
                                    case 0:
                                        AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C10010l(c4456l2, null, 1), 3);
                                        break;
                                    default:
                                        AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C10010l(c4456l2, null, 2), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l6.m2147try(obj19);
                        obj18 = obj19;
                    }
                    c4456l.premium(function9, (Function0) obj18, c6956l6, 0);
                    c6956l6.startapp(false);
                } else if (iOrdinal == 3) {
                    c6956l6.m2123default(510597908);
                    c4456l.f9069l.license(c6956l6, 8);
                    c6956l6.startapp(false);
                } else if (iOrdinal == 4) {
                    c6956l6.m2123default(510840917);
                    C2603l c2603l = c4456l.f9071l;
                    if (c2603l == null) {
                        c6956l6.m2123default(510888284);
                        c6956l6.startapp(false);
                    } else {
                        c6956l6.m2123default(1956142917);
                        c2603l.license(c6956l6, 8);
                        c6956l6.startapp(false);
                        Unit unit = Unit.INSTANCE;
                    }
                    c6956l6.startapp(false);
                } else {
                    if (iOrdinal != 5) {
                        throw AbstractC12900l.billing(1956098410, c6956l6, false);
                    }
                    c6956l6.m2123default(510728356);
                    c4456l.appmetrica(c6956l6, 0);
                    c6956l6.startapp(false);
                }
                return Unit.INSTANCE;
            case 6:
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj16;
                C14089l c14089l = (C14089l) obj15;
                int iIntValue2 = ((Integer) obj2).intValue();
                C6956l c6956l7 = (C6956l) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
                InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(c4346l, 1.0f);
                boolean zAdmob22 = c6956l7.admob(c14089l) | ((((iIntValue3 & 112) ^ 48) > 32 && c6956l7.amazon(iIntValue2)) || (iIntValue3 & 48) == 32);
                Object objM2132native22 = c6956l7.m2132native();
                if (zAdmob22 || objM2132native22 == obj14) {
                    objM2132native22 = new C7365l(c14089l, iIntValue2, i2);
                    c6956l7.m2147try(objM2132native22);
                }
                AbstractC16336l.yandex(interfaceC17242lCrashlytics, null, interfaceC11780l, c7537l, null, null, false, null, (Function1) objM2132native22, c6956l7, 24582, 490);
                return Unit.INSTANCE;
            case 7:
                Function1 function10 = (Function1) obj15;
                int iIntValue4 = ((Integer) obj2).intValue();
                C6956l c6956l8 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                AudioStreamMix audioStreamMix = (AudioStreamMix) ((C1639l) obj16).yandex.get(iIntValue4);
                InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(AbstractC3605l.vip(c4346l, 24.0f, 0.0f, 2), 1.0f);
                C7537l c7537l2 = new C7537l(16.0f, true, new C8339l(12));
                C15089l c15089l = C18450l.f36046l;
                C1853l c1853lYandex = AbstractC1001l.yandex(c7537l2, c15089l, c6956l8, 6);
                long j4 = c6956l8.f14595continue;
                int i9 = (int) (j4 ^ (j4 >>> 32));
                InterfaceC18556l interfaceC18556lSmaato4 = c6956l8.smaato();
                InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l8, interfaceC17242lAmazon2);
                InterfaceC8801l.firebase.getClass();
                C16395l c16395l2 = C3438l.loadAd;
                c6956l8.m2140super();
                if (c6956l8.f14603switch) {
                    c6956l8.firebase(c16395l2);
                } else {
                    c6956l8.m2136protected();
                }
                C6415l c6415l = C3438l.mopub;
                AbstractC8182l.billing(c6956l8, c1853lYandex, c6415l);
                C6415l c6415l2 = C3438l.billing;
                AbstractC8182l.billing(c6956l8, interfaceC18556lSmaato4, c6415l2);
                Integer numValueOf = Integer.valueOf(i9);
                C6415l c6415l3 = C3438l.isPro;
                AbstractC8182l.billing(c6956l8, numValueOf, c6415l3);
                C11192l c11192l = C3438l.firebase;
                AbstractC8182l.purchase(c6956l8, c11192l);
                C6415l c6415l4 = C3438l.amazon;
                AbstractC8182l.billing(c6956l8, interfaceC17242lBilling4, c6415l4);
                C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(4.0f, true, new C8339l(12)), c15089l, c6956l8, 6);
                long j5 = c6956l8.f14595continue;
                int i10 = (int) (j5 ^ (j5 >>> 32));
                InterfaceC18556l interfaceC18556lSmaato5 = c6956l8.smaato();
                InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l8, c4346l);
                c6956l8.m2140super();
                if (c6956l8.f14603switch) {
                    c6956l8.firebase(c16395l2);
                } else {
                    c6956l8.m2136protected();
                }
                AbstractC8182l.billing(c6956l8, c1853lYandex2, c6415l);
                AbstractC8182l.billing(c6956l8, interfaceC18556lSmaato5, c6415l2);
                AbstractC8182l.billing(c6956l8, Integer.valueOf(i10), c6415l3);
                AbstractC8182l.purchase(c6956l8, c11192l);
                AbstractC8182l.billing(c6956l8, interfaceC17242lBilling5, c6415l4);
                AudioStreamMix.Link link = audioStreamMix.amazon;
                if (link == null || (str = link.loadAd) == null) {
                    str = audioStreamMix.loadAd;
                }
                String str6 = str;
                C10707l c10707l = AbstractC3459l.yandex;
                AbstractC11282l.loadAd(str6, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C9472l) c6956l8.isPro(c10707l)).mopub, c6956l8, 0, 0, 65534);
                AbstractC11282l.loadAd(audioStreamMix.crashlytics, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C9472l) c6956l8.isPro(c10707l)).isPro, c6956l8, 0, 0, 65534);
                c6956l8.startapp(true);
                C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36044l, c6956l8, 0);
                long j6 = c6956l8.f14595continue;
                int i11 = (int) (j6 ^ (j6 >>> 32));
                InterfaceC18556l interfaceC18556lSmaato6 = c6956l8.smaato();
                InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l8, c4346l);
                c6956l8.m2140super();
                if (c6956l8.f14603switch) {
                    c6956l8.firebase(c16395l2);
                } else {
                    c6956l8.m2136protected();
                }
                AbstractC8182l.billing(c6956l8, c5062lYandex, c6415l);
                AbstractC8182l.billing(c6956l8, interfaceC18556lSmaato6, c6415l2);
                AbstractC8182l.billing(c6956l8, Integer.valueOf(i11), c6415l3);
                AbstractC8182l.purchase(c6956l8, c11192l);
                AbstractC8182l.billing(c6956l8, interfaceC17242lBilling6, c6415l4);
                C17253l c17253l = AbstractC14927l.crashlytics;
                C9103l c9103lYandex = AbstractC14927l.yandex(((C10936l) c6956l8.isPro(AbstractC10689l.yandex)).subs(), c6956l8, 254);
                boolean zBilling = c6956l8.billing(function10) | c6956l8.billing(audioStreamMix);
                Object objM2132native23 = c6956l8.m2132native();
                Object obj20 = objM2132native23;
                if (zBilling || objM2132native23 == obj14) {
                    Object c5514l = new C5514l(function10, audioStreamMix, 8);
                    c6956l8.m2147try(c5514l);
                    obj20 = c5514l;
                }
                AbstractC6419l.yandex((Function0) obj20, null, c9103lYandex, c17253l, AbstractC1163l.yandex, c6956l8, 0, 2942);
                c6956l8.startapp(true);
                c6956l8.startapp(true);
                return Unit.INSTANCE;
            default:
                C2603l c2603l2 = (C2603l) obj16;
                Object obj21 = (InterfaceC2262l) obj15;
                C6956l c6956l9 = (C6956l) obj3;
                ((Integer) obj4).getClass();
                int iOrdinal2 = ((EnumC13633l) obj2).ordinal();
                if (iOrdinal2 == 0) {
                    c6956l9.m2123default(-378741937);
                    c2603l2.pro(c6956l9, 0);
                    c6956l9.startapp(false);
                } else if (iOrdinal2 == 1) {
                    c6956l9.m2123default(-378633964);
                    c2603l2.advert(c6956l9, 0);
                    c6956l9.startapp(false);
                } else if (iOrdinal2 != 2) {
                    if (iOrdinal2 != 3) {
                        throw AbstractC12900l.billing(957611505, c6956l9, false);
                    }
                    c6956l9.m2123default(-378741937);
                    c2603l2.pro(c6956l9, 0);
                    c6956l9.startapp(false);
                } else {
                    c6956l9.m2123default(-378527634);
                    boolean zAdmob23 = c6956l9.admob(c2603l2) | c6956l9.admob(obj21);
                    Object objM2132native24 = c6956l9.m2132native();
                    if (zAdmob23 || objM2132native24 == obj14) {
                        obj13 = objM2132native24;
                        Object c15575l = new C15575l(c2603l2, obj21, i3);
                        c6956l9.m2147try(c15575l);
                        obj13 = c15575l;
                    }
                    c2603l2.ad((Function1) obj13, c6956l9, 0);
                    c6956l9.startapp(false);
                }
                return Unit.INSTANCE;
        }
    }
}
