package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًٔۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15344l {
    public static final Object yandex = new Object();

    public static final void admob() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0078  */
    /* JADX WARN: Code duplicated, block: B:37:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object amazon(AbstractC6475l abstractC6475l, AbstractC0283l abstractC0283l) throws Throwable {
        C14508l c14508l;
        AbstractC6475l abstractC6475l2;
        C10700l c10700l;
        Throwable th;
        InterfaceC1711l interfaceC1711l;
        InterfaceC1711l interfaceC1711l2;
        if (abstractC0283l instanceof C14508l) {
            c14508l = (C14508l) abstractC0283l;
            int i = c14508l.f28380l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c14508l.f28380l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c14508l = new C14508l(abstractC0283l);
            }
        } else {
            c14508l = new C14508l(abstractC0283l);
        }
        Object obj = c14508l.f28383l;
        int i2 = c14508l.f28380l;
        if (i2 != 0) {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c10700l = c14508l.f28381l;
            abstractC6475l2 = c14508l.f28382l;
            try {
                AbstractC2829l.crashlytics(obj);
                interfaceC1711l2 = (InterfaceC1711l) c10700l.f21708l;
                if (interfaceC1711l2 != null) {
                    abstractC6475l2.loadAd(interfaceC1711l2);
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                interfaceC1711l = (InterfaceC1711l) c10700l.f21708l;
                if (interfaceC1711l != null) {
                    abstractC6475l2.loadAd(interfaceC1711l);
                }
                throw th;
            }
        }
        AbstractC2829l.crashlytics(obj);
        if (((C5268l) abstractC6475l).subs.yandex(EnumC8981l.f18524l)) {
            return Unit.INSTANCE;
        }
        C10700l c10700l2 = new C10700l();
        try {
            c14508l.f28382l = abstractC6475l;
            c14508l.f28381l = c10700l2;
            c14508l.f28380l = 1;
            C2397l c2397l = new C2397l(1, AbstractC17082l.billing(c14508l));
            c2397l.license();
            C4437l c4437l = new C4437l(2, c2397l);
            c10700l2.f21708l = c4437l;
            abstractC6475l.yandex(c4437l);
            Object objSignature = c2397l.Signature();
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objSignature == enumC9342l) {
                return enumC9342l;
            }
            abstractC6475l2 = abstractC6475l;
            c10700l = c10700l2;
            interfaceC1711l2 = (InterfaceC1711l) c10700l.f21708l;
            if (interfaceC1711l2 != null) {
                abstractC6475l2.loadAd(interfaceC1711l2);
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            abstractC6475l2 = abstractC6475l;
            c10700l = c10700l2;
            th = th3;
            interfaceC1711l = (InterfaceC1711l) c10700l.f21708l;
            if (interfaceC1711l != null) {
                abstractC6475l2.loadAd(interfaceC1711l);
            }
            throw th;
        }
    }

    public static Object billing(Function2 function2) {
        return AbstractC10999l.subs(C17218l.f33421l, function2);
    }

    public static final Object crashlytics(InterfaceC6843l interfaceC6843l, InterfaceC17435l interfaceC17435l, InterfaceC2077l interfaceC2077l, InterfaceC14029l interfaceC14029l) {
        C4566l c4566l = (C4566l) interfaceC6843l;
        c4566l.getClass();
        Object objCrashlytics = AbstractC11141l.crashlytics(interfaceC6843l, new C3977l(new C13698l(AbstractC5573l.metrica(c4566l).f7699l), interfaceC17435l, interfaceC2077l, (InterfaceC14029l) null), interfaceC14029l);
        return objCrashlytics == EnumC9342l.f19165l ? objCrashlytics : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c3, code lost:
    
        if (r14 == r5) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object loadAd(defpackage.C17249l r10, defpackage.InterfaceC2077l r11, defpackage.C9185l r12, int r13, defpackage.AbstractC12050l r14) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC15344l.loadAd(lٜٗؒ, lؘؓۙ, lٌۦ, int, lِۗٓ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r15 == r6) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object mopub(defpackage.C17249l r12, defpackage.InterfaceC2077l r13, defpackage.C9185l r14, defpackage.AbstractC12050l r15) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC15344l.mopub(lٜٗؒ, lؘؓۙ, lٌۦ, lِۗٓ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0081 A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:20:0x0040, B:31:0x0079, B:33:0x0081, B:35:0x008d, B:37:0x0099, B:28:0x0060), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008d A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:20:0x0040, B:31:0x0079, B:33:0x0081, B:35:0x008d, B:37:0x0099, B:28:0x0060), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0099 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:20:0x0040, B:31:0x0079, B:33:0x0081, B:35:0x008d, B:37:0x0099, B:28:0x0060), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fb A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002d, B:54:0x00e3, B:56:0x00eb, B:58:0x00ef, B:60:0x00fb, B:62:0x0107, B:50:0x00bd), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0107 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002d, B:54:0x00e3, B:56:0x00eb, B:58:0x00ef, B:60:0x00fb, B:62:0x0107, B:50:0x00bd), top: B:69:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object purchase(C17249l c17249l, InterfaceC17435l interfaceC17435l, C13698l c13698l, C9185l c9185l, AbstractC12050l abstractC12050l) {
        C15348l c15348l;
        C11379l c11379l;
        C17249l c17249l2;
        C9122l c9122l;
        List list;
        int size;
        C15730l c15730l;
        List list2;
        int size2;
        C15730l c15730l2;
        C11379l c11379l2 = C1461l.f3667l;
        if (abstractC12050l instanceof C15348l) {
            c15348l = (C15348l) abstractC12050l;
            int i = c15348l.f30010l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15348l.f30010l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15348l = new C15348l(abstractC12050l);
            }
        } else {
            c15348l = new C15348l(abstractC12050l);
        }
        Object objBilling = c15348l.f30009l;
        int i2 = c15348l.f30010l;
        int i3 = 0;
        try {
            try {
                if (i2 == 0) {
                    AbstractC2829l.crashlytics(objBilling);
                    C15730l c15730l3 = (C15730l) c9185l.yandex.get(0);
                    int i4 = c9185l.purchase & 1;
                    EnumC9342l enumC9342l = EnumC9342l.f19165l;
                    if (i4 == 0) {
                        int i5 = c13698l.f26744l;
                        if (i5 != 1) {
                            c11379l = i5 != 2 ? C1461l.f3668l : C1461l.f3646l;
                        } else {
                            c11379l = c11379l2;
                        }
                        if (interfaceC17435l.firebase(c15730l3.crashlytics, c11379l, i5)) {
                            C9122l c9122l2 = new C9122l();
                            c9122l2.f18750l = !c11379l.equals(c11379l2);
                            long j = c15730l3.yandex;
                            C6411l c6411l = new C6411l(interfaceC17435l, c11379l, c9122l2, 4);
                            c15348l.f30012l = c17249l;
                            c15348l.f30011l = interfaceC17435l;
                            c15348l.f30013l = c9122l2;
                            c15348l.f30010l = 2;
                            objBilling = AbstractC7289l.billing(c17249l, j, c6411l, c15348l);
                            if (objBilling != enumC9342l) {
                                c17249l2 = c17249l;
                                c9122l = c9122l2;
                                if (((Boolean) objBilling).booleanValue()) {
                                    list2 = c17249l2.f33476l.f9255l.yandex;
                                    size2 = list2.size();
                                    while (i3 < size2) {
                                        c15730l2 = (C15730l) list2.get(i3);
                                        if (AbstractC3474l.purchase(c15730l2)) {
                                            c15730l2.yandex();
                                        }
                                        i3++;
                                    }
                                }
                                interfaceC17435l.subs();
                            }
                            return enumC9342l;
                        }
                    } else if (interfaceC17435l.vip(c15730l3.crashlytics)) {
                        c15730l3.yandex();
                        long j2 = c15730l3.yandex;
                        C16931l c16931l = new C16931l(19, interfaceC17435l);
                        c15348l.f30012l = c17249l;
                        c15348l.f30011l = interfaceC17435l;
                        c15348l.f30010l = 1;
                        objBilling = AbstractC7289l.billing(c17249l, j2, c16931l, c15348l);
                        if (objBilling == enumC9342l) {
                            return enumC9342l;
                        }
                        if (((Boolean) objBilling).booleanValue()) {
                            list = c17249l.f33476l.f9255l.yandex;
                            size = list.size();
                            while (i3 < size) {
                                c15730l = (C15730l) list.get(i3);
                                if (AbstractC3474l.purchase(c15730l)) {
                                    c15730l.yandex();
                                }
                                i3++;
                            }
                        }
                        interfaceC17435l.subs();
                    }
                } else if (i2 == 1) {
                    interfaceC17435l = c15348l.f30011l;
                    c17249l = c15348l.f30012l;
                    AbstractC2829l.crashlytics(objBilling);
                    if (((Boolean) objBilling).booleanValue()) {
                        list = c17249l.f33476l.f9255l.yandex;
                        size = list.size();
                        while (i3 < size) {
                            c15730l = (C15730l) list.get(i3);
                            if (AbstractC3474l.purchase(c15730l)) {
                                c15730l.yandex();
                            }
                            i3++;
                        }
                    }
                    interfaceC17435l.subs();
                } else {
                    if (i2 != 2) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c9122l = c15348l.f30013l;
                    interfaceC17435l = c15348l.f30011l;
                    c17249l2 = c15348l.f30012l;
                    AbstractC2829l.crashlytics(objBilling);
                    if (((Boolean) objBilling).booleanValue() && c9122l.f18750l) {
                        list2 = c17249l2.f33476l.f9255l.yandex;
                        size2 = list2.size();
                        while (i3 < size2) {
                            c15730l2 = (C15730l) list2.get(i3);
                            if (AbstractC3474l.purchase(c15730l2)) {
                                c15730l2.yandex();
                            }
                            i3++;
                        }
                    }
                    interfaceC17435l.subs();
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                interfaceC17435l.subs();
                throw th;
            }
        } catch (Throwable th2) {
            interfaceC17435l.subs();
            throw th2;
        }
    }

    public static String subs(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder sbIsVip = AbstractC5020l.isVip("<", str2, " threw ");
                    sbIsVip.append(e.getClass().getName());
                    sbIsVip.append(">");
                    string = sbIsVip.toString();
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[LOOP:0: B:19:0x0049->B:23:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object yandex(defpackage.C17249l r6, defpackage.AbstractC12050l r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C4135l
            if (r0 == 0) goto L13
            r0 = r7
            lًٕؖ r0 = (defpackage.C4135l) r0
            int r1 = r0.f8494l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8494l = r1
            goto L18
        L13:
            lًٕؖ r0 = new lًٕؖ
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f8492l
            int r1 = r0.f8494l
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            lٜٗؒ r6 = r0.f8493l
            defpackage.AbstractC2829l.crashlytics(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.AbstractC2829l.crashlytics(r7)
        L31:
            r0.f8493l = r6
            r0.f8494l = r2
            lٌۜۙ r7 = defpackage.EnumC9065l.f18653l
            java.lang.Object r7 = r6.crashlytics(r7, r0)
            lٍؗؐ r1 = defpackage.EnumC9342l.f19165l
            if (r7 != r1) goto L40
            return r1
        L40:
            lٌۦ r7 = (defpackage.C9185l) r7
            java.util.List r1 = r7.yandex
            int r3 = r1.size()
            r4 = 0
        L49:
            if (r4 >= r3) goto L5b
            java.lang.Object r5 = r1.get(r4)
            lَٕٗ r5 = (defpackage.C15730l) r5
            boolean r5 = defpackage.AbstractC3474l.crashlytics(r5)
            if (r5 != 0) goto L58
            goto L31
        L58:
            int r4 = r4 + 1
            goto L49
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC15344l.yandex(lٜٗؒ, lِۗٓ):java.lang.Object");
    }
}
