package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: lٔۤ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15291l implements InterfaceC11445l {
    public final float admob;
    public C14513l amazon;
    public final long billing;
    public C8565l crashlytics;
    public boolean isPro;
    public final InterfaceC0587l loadAd;
    public final long mopub;
    public final long purchase;
    public final float subs;
    public final C4854l yandex;

    public C15291l(InterfaceC0587l interfaceC0587l, InterfaceC6384l interfaceC6384l) {
        C8565l c8565l = new C8565l(28);
        this.loadAd = interfaceC0587l;
        this.crashlytics = c8565l;
        C4854l c4854l = new C4854l(interfaceC6384l, c8565l);
        this.yandex = c4854l;
        if (interfaceC0587l != ((InterfaceC0587l) c4854l.billing)) {
            c4854l.billing = interfaceC0587l;
            ((HashMap) c4854l.amazon).clear();
            ((HashMap) c4854l.purchase).clear();
        }
        this.purchase = -9223372036854775807L;
        this.billing = -9223372036854775807L;
        this.mopub = -9223372036854775807L;
        this.admob = -3.4028235E38f;
        this.subs = -3.4028235E38f;
        this.isPro = true;
    }

    public static InterfaceC11445l billing(Class cls, InterfaceC0587l interfaceC0587l) {
        try {
            return (InterfaceC11445l) cls.getConstructor(InterfaceC0587l.class).newInstance(interfaceC0587l);
        } catch (Exception e) {
            C11983l.ads(e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v31, types: [byte[], java.lang.Cloneable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.InterfaceC11445l
    public final AbstractC14384l amazon(C2427l c2427l) {
        Uri uri;
        byte b;
        byte b2;
        byte b3;
        C17805l c17805l;
        long j;
        Uri uri2;
        String str;
        C8842l c8842l;
        String str2;
        Object obj;
        C17805l c17805l2;
        C17464l c17464l;
        C2427l c2427l2 = c2427l;
        c2427l2.loadAd.getClass();
        String scheme = c2427l2.loadAd.yandex.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        boolean zEquals = Objects.equals(c2427l2.loadAd.loadAd, "application/x-image-uri");
        C17805l c17805l3 = c2427l2.loadAd;
        if (zEquals) {
            long j2 = c17805l3.subs;
            String str3 = AbstractC15323l.yandex;
            throw null;
        }
        int iM3976private = AbstractC15323l.m3976private(c17805l3.yandex, c17805l3.loadAd);
        boolean z = true;
        if (c2427l2.loadAd.subs != -9223372036854775807L) {
            InterfaceC6384l interfaceC6384l = (InterfaceC6384l) this.yandex.crashlytics;
            if (interfaceC6384l instanceof C2760l) {
                C2760l c2760l = (C2760l) interfaceC6384l;
                synchronized (c2760l) {
                    c2760l.f5994l = 1;
                }
            }
            C4854l.yandex(this.yandex);
        }
        try {
            InterfaceC11445l interfaceC11445lLoadAd = this.yandex.loadAd(iM3976private);
            C2410l c2410lYandex = c2427l2.crashlytics.yandex();
            C7828l c7828l = c2427l2.crashlytics;
            if (c7828l.yandex == -9223372036854775807L) {
                c2410lYandex.yandex = this.purchase;
            }
            if (c7828l.amazon == -3.4028235E38f) {
                c2410lYandex.amazon = this.admob;
            }
            if (c7828l.purchase == -3.4028235E38f) {
                c2410lYandex.purchase = this.subs;
            }
            if (c7828l.loadAd == -9223372036854775807L) {
                c2410lYandex.loadAd = this.billing;
            }
            if (c7828l.crashlytics == -9223372036854775807L) {
                c2410lYandex.crashlytics = this.mopub;
            }
            C7828l c7828l2 = new C7828l(c2410lYandex);
            if (c7828l2.equals(c2427l2.crashlytics)) {
                uri = null;
                z = true;
                b = 0;
            } else {
                C17464l c17464l2 = new C17464l();
                List list = Collections.EMPTY_LIST;
                AbstractC1186l abstractC1186l = C13708l.f26763l;
                C11470l c11470l = C11470l.amazon;
                C9202l c9202l = c2427l2.purchase;
                C0935l c0935l = new C0935l();
                c0935l.yandex = c9202l.loadAd;
                c0935l.loadAd = c9202l.amazon;
                c0935l.crashlytics = c9202l.purchase;
                c0935l.amazon = c9202l.billing;
                c0935l.purchase = c9202l.mopub;
                c0935l.billing = c9202l.admob;
                String str4 = c2427l2.yandex;
                C3852l c3852l = c2427l2.amazon;
                c2427l2.crashlytics.yandex();
                C11470l c11470l2 = c2427l2.billing;
                C17805l c17805l4 = c2427l2.loadAd;
                if (c17805l4 != null) {
                    String str5 = c17805l4.billing;
                    String str6 = c17805l4.loadAd;
                    Uri uri3 = c17805l4.yandex;
                    list = c17805l4.purchase;
                    abstractC1186l = c17805l4.mopub;
                    uri = null;
                    Object obj2 = c17805l4.admob;
                    C14227l c14227l = c17805l4.crashlytics;
                    if (c14227l != null) {
                        b = 0;
                        C17464l c17464l3 = new C17464l();
                        c17464l3.amazon = c14227l.yandex;
                        c17464l3.purchase = c14227l.loadAd;
                        c17464l3.billing = c14227l.crashlytics;
                        c17464l3.yandex = c14227l.amazon;
                        c17464l3.loadAd = c14227l.purchase;
                        c17464l3.crashlytics = c14227l.billing;
                        c17464l3.mopub = c14227l.mopub;
                        c17464l3.admob = c14227l.admob;
                        c17464l = c17464l3;
                    } else {
                        b = 0;
                        c17464l = new C17464l();
                    }
                    C8842l c8842l2 = c17805l4.amazon;
                    j = c17805l4.subs;
                    c8842l = c8842l2;
                    str = str6;
                    uri2 = uri3;
                    str2 = str5;
                    obj = obj2;
                    c17464l2 = c17464l;
                } else {
                    uri = null;
                    b = 0;
                    j = -9223372036854775807L;
                    uri2 = null;
                    str = null;
                    c8842l = null;
                    str2 = null;
                    obj = null;
                }
                List list2 = list;
                AbstractC1186l abstractC1186l2 = abstractC1186l;
                C2410l c2410lYandex2 = c7828l2.yandex();
                AbstractC12442l.subscription((((Uri) c17464l2.purchase) == null || ((UUID) c17464l2.amazon) != null) ? z : b);
                if (uri2 != null) {
                    c17805l2 = new C17805l(uri2, str, ((UUID) c17464l2.amazon) != null ? new C14227l(c17464l2) : uri, c8842l, list2, str2, abstractC1186l2, obj, j);
                } else {
                    c17805l2 = uri;
                }
                if (str4 == null) {
                    str4 = "";
                }
                String str7 = str4;
                C9202l c9202l2 = new C9202l(c0935l);
                C7828l c7828l3 = new C7828l(c2410lYandex2);
                if (c3852l == null) {
                    c3852l = C3852l.f7980private;
                }
                c2427l2 = new C2427l(str7, c9202l2, c17805l2, c7828l3, c3852l, c11470l2);
            }
            AbstractC14384l abstractC14384lAmazon = interfaceC11445lLoadAd.amazon(c2427l2);
            AbstractC1186l abstractC1186l3 = c2427l2.loadAd.mopub;
            if (abstractC1186l3.isEmpty()) {
                b2 = b;
            } else {
                AbstractC14384l[] abstractC14384lArr = new AbstractC14384l[abstractC1186l3.size() + 1];
                abstractC14384lArr[b] = abstractC14384lAmazon;
                int i = b;
                while (i < abstractC1186l3.size()) {
                    int i2 = 6;
                    int i3 = -1;
                    if (this.isPro) {
                        C12984l c12984l = new C12984l();
                        c12984l.vip = AbstractC3825l.vip(((C9749l) abstractC1186l3.get(i)).loadAd);
                        c12984l.amazon = ((C9749l) abstractC1186l3.get(i)).crashlytics;
                        c12984l.purchase = ((C9749l) abstractC1186l3.get(i)).amazon;
                        c12984l.billing = ((C9749l) abstractC1186l3.get(i)).purchase;
                        c12984l.loadAd = ((C9749l) abstractC1186l3.get(i)).billing;
                        c12984l.yandex = ((C9749l) abstractC1186l3.get(i)).mopub;
                        C5978l c5978l = new C5978l(c12984l);
                        C5131l c5131l = new C5131l(this, c5978l, 15);
                        InterfaceC0587l interfaceC0587l = this.loadAd;
                        C6536l c6536l = new C6536l(27, c5131l);
                        C18449l c18449l = new C18449l(13);
                        C14513l c14513l = new C14513l(i3, i2, b);
                        if (this.crashlytics.mopub(c5978l)) {
                            C12984l c12984lYandex = c5978l.yandex();
                            c12984lYandex.vip = AbstractC3825l.vip("application/x-media3-cues");
                            c12984lYandex.isPro = c5978l.metrica;
                            c12984lYandex.f25443private = this.crashlytics.metrica(c5978l);
                            c5978l = new C5978l(c12984lYandex);
                        }
                        C5978l c5978l2 = c5978l;
                        C14513l c14513l2 = this.amazon;
                        C14513l c14513l3 = c14513l2 != null ? c14513l2 : c14513l;
                        int i4 = i + 1;
                        String string = ((C9749l) abstractC1186l3.get(i)).yandex.toString();
                        C0935l c0935l2 = new C0935l();
                        C17464l c17464l4 = new C17464l();
                        List list3 = Collections.EMPTY_LIST;
                        C13708l c13708l = C13708l.f26763l;
                        C2410l c2410l = new C2410l();
                        C11470l c11470l3 = C11470l.amazon;
                        Uri uri4 = string == null ? uri : Uri.parse(string);
                        AbstractC12442l.subscription((((Uri) c17464l4.purchase) == null || ((UUID) c17464l4.amazon) != null) ? z : false);
                        if (uri4 != null) {
                            c17805l = new C17805l(uri4, null, ((UUID) c17464l4.amazon) != null ? new C14227l(c17464l4) : uri, null, list3, null, c13708l, null, -9223372036854775807L);
                        } else {
                            c17805l = uri;
                        }
                        C2427l c2427l3 = new C2427l("", new C9202l(c0935l2), c17805l, new C7828l(c2410l), C3852l.f7980private, c11470l3);
                        c17805l.getClass();
                        abstractC14384lArr[i4] = new C10743l(c2427l3, interfaceC0587l, c6536l, c18449l.m4550package(c2427l3), c14513l3, 1048576, c5978l2);
                        b3 = 0;
                    } else {
                        InterfaceC0587l interfaceC0587l2 = this.loadAd;
                        interfaceC0587l2.getClass();
                        b3 = 0;
                        C14513l c14513l4 = new C14513l(i3, i2, b3);
                        C14513l c14513l5 = this.amazon;
                        if (c14513l5 != null) {
                            c14513l4 = c14513l5;
                        }
                        abstractC14384lArr[i + 1] = new C3163l((C9749l) abstractC1186l3.get(i), interfaceC0587l2, c14513l4);
                    }
                    i++;
                    b = b3;
                }
                b2 = b;
                abstractC14384lAmazon = new C16736l(abstractC14384lArr);
            }
            C9202l c9202l3 = c2427l2.purchase;
            if (c9202l3.loadAd != 0 || c9202l3.amazon != Long.MIN_VALUE || c9202l3.billing) {
                C7361l c7361l = new C7361l(abstractC14384lAmazon);
                long j3 = c9202l3.loadAd;
                AbstractC12442l.admob(j3 >= 0 ? z : b2);
                AbstractC12442l.subscription(!c7361l.admob);
                c7361l.loadAd = j3;
                long j4 = c9202l3.amazon;
                AbstractC12442l.subscription(!c7361l.admob);
                c7361l.crashlytics = j4;
                boolean z2 = !c9202l3.mopub;
                AbstractC12442l.subscription(!c7361l.admob);
                c7361l.amazon = z2;
                boolean z3 = c9202l3.purchase;
                AbstractC12442l.subscription(!c7361l.admob);
                c7361l.purchase = z3;
                boolean z4 = c9202l3.billing;
                AbstractC12442l.subscription(!c7361l.admob);
                c7361l.billing = z4;
                boolean z5 = c9202l3.admob;
                AbstractC12442l.subscription(!c7361l.admob);
                c7361l.mopub = z5;
                AbstractC12442l.subscription(!c7361l.admob);
                c7361l.admob = z;
                abstractC14384lAmazon = new C11089l(c7361l);
            }
            c2427l2.loadAd.getClass();
            if (c2427l2.loadAd.amazon == null) {
                return abstractC14384lAmazon;
            }
            AbstractC6427l.vip("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return abstractC14384lAmazon;
        } catch (ClassNotFoundException e) {
            C11983l.ads(e);
            return null;
        }
    }

    @Override // defpackage.InterfaceC11445l
    public final InterfaceC11445l crashlytics(boolean z) {
        this.isPro = z;
        C4854l c4854l = this.yandex;
        c4854l.yandex = z;
        ((InterfaceC6384l) c4854l.crashlytics).firebase(z);
        Iterator it = ((HashMap) c4854l.purchase).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC11445l) it.next()).crashlytics(z);
        }
        return this;
    }

    @Override // defpackage.InterfaceC11445l
    public final InterfaceC11445l loadAd(int i) {
        C4854l c4854l = this.yandex;
        c4854l.loadAd = i;
        ((InterfaceC6384l) c4854l.crashlytics).loadAd(i);
        return this;
    }

    public final void mopub(C14513l c14513l) {
        AbstractC12442l.metrica(c14513l, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.amazon = c14513l;
        C4854l c4854l = this.yandex;
        c4854l.admob = c14513l;
        Iterator it = ((HashMap) c4854l.purchase).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC11445l) it.next()).purchase(c14513l);
        }
    }

    @Override // defpackage.InterfaceC11445l
    public final /* bridge */ /* synthetic */ InterfaceC11445l purchase(C14513l c14513l) {
        mopub(c14513l);
        return this;
    }

    @Override // defpackage.InterfaceC11445l
    public final InterfaceC11445l yandex(C8565l c8565l) {
        this.crashlytics = c8565l;
        C4854l c4854l = this.yandex;
        c4854l.mopub = c8565l;
        ((InterfaceC6384l) c4854l.crashlytics).yandex(c8565l);
        Iterator it = ((HashMap) c4854l.purchase).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC11445l) it.next()).yandex(c8565l);
        }
        return this;
    }
}
