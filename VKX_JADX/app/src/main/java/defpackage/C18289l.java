package defpackage;

import android.net.Uri;
import android.util.Size;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٜ٘ۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18289l {
    public Object admob;
    public Object amazon;
    public Object billing;
    public Object crashlytics;
    public Object firebase;
    public Object isPro;
    public Object loadAd;
    public Object mopub;
    public Object purchase;
    public Object subs;
    public final /* synthetic */ int yandex;

    public C18289l(C17804l c17804l, SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l, C18527l c18527l, int i, int i2, int i3, int i4) {
        this.yandex = 4;
        this.loadAd = c17804l;
        this.amazon = surfaceHolderCallbackC18330l;
        this.purchase = c18527l;
        this.billing = new C3904l();
        this.mopub = c18527l.yandex(c17804l.f34685l, new C6352l(3, this));
        this.admob = new C4440l(this, i);
        this.subs = new C8078l(this, i2);
        this.isPro = new C16459l(this, i3);
        this.firebase = new C6308l(this, i4);
        C15523l c15523l = new C15523l(2, this);
        this.crashlytics = c15523l;
        c17804l.f34677l.yandex(c15523l);
    }

    public static AbstractC14971l billing(AbstractC14971l abstractC14971l) {
        boolean z = abstractC14971l.f29462l;
        if (z) {
            C7661l c7661l = AbstractC3068l.yandex;
            if (!z) {
                AbstractC0081l.crashlytics("autoInvalidateRemovedNode called on unattached node");
            }
            AbstractC3068l.yandex(abstractC14971l, -1, 2);
            abstractC14971l.mo3068l();
            abstractC14971l.mo3065l();
        }
        AbstractC14971l abstractC14971l2 = abstractC14971l.f29460l;
        AbstractC14971l abstractC14971l3 = abstractC14971l.f29456l;
        if (abstractC14971l2 != null) {
            abstractC14971l2.f29456l = abstractC14971l3;
            abstractC14971l.f29460l = null;
        }
        if (abstractC14971l3 != null) {
            abstractC14971l3.f29460l = abstractC14971l2;
            abstractC14971l.f29456l = null;
        }
        return abstractC14971l3;
    }

    public static AbstractC14971l purchase(InterfaceC13112l interfaceC13112l, AbstractC14971l abstractC14971l) {
        AbstractC14971l abstractC14971lLoadAd;
        if (interfaceC13112l instanceof AbstractC12338l) {
            abstractC14971lLoadAd = ((AbstractC12338l) interfaceC13112l).loadAd();
            abstractC14971lLoadAd.f29450l = AbstractC3068l.billing(abstractC14971lLoadAd);
        } else {
            C4101l c4101l = new C4101l();
            c4101l.f29450l = AbstractC3068l.amazon(interfaceC13112l);
            c4101l.f8440l = interfaceC13112l;
            c4101l.f8439l = new HashSet();
            abstractC14971lLoadAd = c4101l;
        }
        if (abstractC14971lLoadAd.f29462l) {
            AbstractC0081l.crashlytics("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        abstractC14971lLoadAd.f29459l = true;
        AbstractC14971l abstractC14971l2 = abstractC14971l.f29460l;
        if (abstractC14971l2 != null) {
            abstractC14971l2.f29456l = abstractC14971lLoadAd;
            abstractC14971lLoadAd.f29460l = abstractC14971l2;
        }
        abstractC14971l.f29460l = abstractC14971lLoadAd;
        abstractC14971lLoadAd.f29456l = abstractC14971l;
        return abstractC14971lLoadAd;
    }

    public static void smaato(InterfaceC13112l interfaceC13112l, InterfaceC13112l interfaceC13112l2, AbstractC14971l abstractC14971l) {
        if ((interfaceC13112l instanceof AbstractC12338l) && (interfaceC13112l2 instanceof AbstractC12338l)) {
            ((AbstractC12338l) interfaceC13112l2).admob(abstractC14971l);
            if (abstractC14971l.f29462l) {
                AbstractC3068l.crashlytics(abstractC14971l);
                return;
            } else {
                abstractC14971l.f29455l = true;
                return;
            }
        }
        if (!(abstractC14971l instanceof C4101l)) {
            AbstractC0081l.crashlytics("Unknown Modifier.Node type");
            return;
        }
        C4101l c4101l = (C4101l) abstractC14971l;
        boolean z = c4101l.f29462l;
        if (z) {
            if (!z) {
                AbstractC0081l.crashlytics("unInitializeModifier called on unattached node");
            }
            if ((c4101l.f29450l & 8) != 0) {
                ((ViewTreeObserverOnGlobalLayoutListenerC13840l) AbstractC5573l.startapp(c4101l)).signatures();
            }
        }
        c4101l.f8440l = interfaceC13112l2;
        c4101l.f29450l = AbstractC3068l.amazon(interfaceC13112l2);
        if (c4101l.f29462l) {
            c4101l.m1494l(false);
        }
        if (abstractC14971l.f29462l) {
            AbstractC3068l.crashlytics(abstractC14971l);
        } else {
            abstractC14971l.f29455l = true;
        }
    }

    public static final void yandex(C18289l c18289l, AbstractC14971l abstractC14971l, AbstractC18026l abstractC18026l) {
        for (AbstractC14971l abstractC14971l2 = abstractC14971l.f29456l; abstractC14971l2 != null; abstractC14971l2 = abstractC14971l2.f29456l) {
            if (abstractC14971l2 == ((C15214l) c18289l.crashlytics)) {
                C3654l c3654lLicense = ((C3654l) c18289l.loadAd).license();
                abstractC18026l.f35294l = c3654lLicense != null ? (C11103l) c3654lLicense.f7703l.amazon : null;
                c18289l.purchase = abstractC18026l;
                return;
            } else {
                if ((abstractC14971l2.f29450l & 2) != 0) {
                    return;
                }
                abstractC14971l2.mo3072l(abstractC18026l);
            }
        }
    }

    public boolean admob(int i) {
        return (((AbstractC14971l) this.mopub).f29457l & i) != 0;
    }

    public C5274l amazon() {
        String strConcat = ((String) this.loadAd) == null ? " mimeType" : "";
        if (((Integer) this.crashlytics) == null) {
            strConcat = strConcat.concat(" profile");
        }
        if (((EnumC8920l) this.amazon) == null) {
            strConcat = strConcat.concat(" inputTimebase");
        }
        if (((Size) this.purchase) == null) {
            strConcat = strConcat.concat(" resolution");
        }
        if (((Integer) this.billing) == null) {
            strConcat = strConcat.concat(" colorFormat");
        }
        if (((C8581l) this.mopub) == null) {
            strConcat = strConcat.concat(" dataSpace");
        }
        if (((Integer) this.admob) == null) {
            strConcat = strConcat.concat(" captureFrameRate");
        }
        if (((Integer) this.subs) == null) {
            strConcat = strConcat.concat(" encodeFrameRate");
        }
        if (((Integer) this.isPro) == null) {
            strConcat = strConcat.concat(" IFrameInterval");
        }
        if (((Integer) this.firebase) == null) {
            strConcat = strConcat.concat(" bitrate");
        }
        if (strConcat.isEmpty()) {
            return new C5274l((String) this.loadAd, ((Integer) this.crashlytics).intValue(), (EnumC8920l) this.amazon, (Size) this.purchase, ((Integer) this.billing).intValue(), (C8581l) this.mopub, ((Integer) this.admob).intValue(), ((Integer) this.subs).intValue(), ((Integer) this.isPro).intValue(), ((Integer) this.firebase).intValue());
        }
        C8339l.smaato("Missing required properties:".concat(strConcat));
        return null;
    }

    public C10555l crashlytics() {
        String strConcat = ((String) this.loadAd) == null ? " transportName" : "";
        if (((C3385l) this.amazon) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.purchase) == null) {
            strConcat = strConcat.concat(" eventMillis");
        }
        if (((Long) this.billing) == null) {
            strConcat = strConcat.concat(" uptimeMillis");
        }
        if (((HashMap) this.mopub) == null) {
            strConcat = strConcat.concat(" autoMetadata");
        }
        if (strConcat.isEmpty()) {
            return new C10555l((String) this.loadAd, (Integer) this.crashlytics, (C3385l) this.amazon, ((Long) this.purchase).longValue(), ((Long) this.billing).longValue(), (HashMap) this.mopub, (Integer) this.admob, (String) this.subs, (byte[]) this.isPro, (byte[]) this.firebase);
        }
        C8339l.smaato("Missing required properties:".concat(strConcat));
        return null;
    }

    public void firebase() {
        C9405l c9405l;
        InterfaceC10702l interfaceC10702l;
        C3654l c3654l = (C3654l) this.loadAd;
        AbstractC18026l abstractC18026l = (C11103l) this.amazon;
        for (AbstractC14971l abstractC14971l = ((C13924l) this.billing).f29456l; abstractC14971l != null; abstractC14971l = abstractC14971l.f29456l) {
            InterfaceC7150l interfaceC7150lCrashlytics = AbstractC5573l.crashlytics(abstractC14971l);
            if (interfaceC7150lCrashlytics != null) {
                AbstractC18026l abstractC18026l2 = abstractC14971l.f29452l;
                if (abstractC18026l2 != null) {
                    c9405l = (C9405l) abstractC18026l2;
                    InterfaceC7150l interfaceC7150l = c9405l.f19247l;
                    c9405l.m2642l(interfaceC7150lCrashlytics);
                    if (interfaceC7150l != abstractC14971l && (interfaceC10702l = c9405l.f35287l) != null) {
                        ((C6577l) interfaceC10702l).crashlytics();
                    }
                } else {
                    c9405l = new C9405l(c3654l, interfaceC7150lCrashlytics);
                    abstractC14971l.mo3072l(c9405l);
                }
                abstractC18026l.f35294l = c9405l;
                c9405l.f35271l = abstractC18026l;
                abstractC18026l = c9405l;
            } else {
                abstractC14971l.mo3072l(abstractC18026l);
            }
        }
        C3654l c3654lLicense = c3654l.license();
        abstractC18026l.f35294l = c3654lLicense != null ? (C11103l) c3654lLicense.f7703l.amazon : null;
        this.purchase = abstractC18026l;
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0144 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:40:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x0120  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0142  */
    /* JADX WARN: Code duplicated, block: B:72:0x018c  */
    /* JADX WARN: Code duplicated, block: B:73:0x018f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0193  */
    /* JADX WARN: Code duplicated, block: B:76:0x0196  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x01a2
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public void isPro(int r32, defpackage.C17893l r33, defpackage.C17893l r34, defpackage.AbstractC14971l r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 935
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18289l.isPro(int, lْ٘ۖ, lْ٘ۖ, lٟٔٙ, boolean):void");
    }

    public void loadAd(String str, String str2) {
        HashMap map = (HashMap) this.mopub;
        if (map != null) {
            map.put(str, str2);
        } else {
            C8339l.smaato("Property \"autoMetadata\" has not been set");
        }
    }

    public void metrica(Uri uri, Object obj) throws IOException {
        String str = (String) this.loadAd;
        C2830l c2830l = (C2830l) this.billing;
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".tmp")).build();
        try {
            C18420l c18420l = (C18420l) this.admob;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
            sb.append("Write ");
            sb.append(str);
            RunnableC9543l runnableC9543lTapsense = c18420l.tapsense(sb.toString());
            try {
                C5633l c5633l = new C5633l(13);
                try {
                    C1381l c1381lLoadAd = c2830l.loadAd(uriBuild);
                    ArrayList arrayListAdmob = c1381lLoadAd.admob(((InterfaceC14033l) c1381lLoadAd.f3513l).amazon((Uri) c1381lLoadAd.f3514l));
                    new C5633l[]{c5633l}[0].admob(arrayListAdmob);
                    OutputStream outputStream = (OutputStream) arrayListAdmob.get(0);
                    try {
                        ((AbstractC12570l) obj).loadAd(outputStream);
                        if (((C17407l) c5633l.f11985l) == null) {
                            throw new C8413l("Cannot sync underlying stream");
                        }
                        ((OutputStream) c5633l.f11986l).flush();
                        ((C17407l) c5633l.f11985l).f33913l.getFD().sync();
                        outputStream.close();
                        runnableC9543lTapsense.close();
                        C1381l c1381lLoadAd2 = c2830l.loadAd(uriBuild);
                        C1381l c1381lLoadAd3 = c2830l.loadAd(uri);
                        InterfaceC14033l interfaceC14033l = (InterfaceC14033l) c1381lLoadAd2.f3513l;
                        if (interfaceC14033l != ((InterfaceC14033l) c1381lLoadAd3.f3513l)) {
                            throw new C8413l("Cannot rename file across backends");
                        }
                        interfaceC14033l.billing((Uri) c1381lLoadAd2.f3514l, (Uri) c1381lLoadAd3.f3514l);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw AbstractC14760l.admob(c2830l, uri, e, str);
                }
            } catch (Throwable th3) {
                try {
                    runnableC9543lTapsense.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e2) {
            C1381l c1381lLoadAd4 = c2830l.loadAd(uriBuild);
            if (((InterfaceC14033l) c1381lLoadAd4.f3513l).loadAd((Uri) c1381lLoadAd4.f3514l)) {
                try {
                    C1381l c1381lLoadAd5 = c2830l.loadAd(uriBuild);
                    ((InterfaceC14033l) c1381lLoadAd5.f3513l).purchase((Uri) c1381lLoadAd5.f3514l);
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }

    public void mopub(Function1 function1) {
        C17219l c17219l = (C17219l) this.loadAd;
        c17219l.f33424l++;
        ((C17893l) c17219l.f33426l).crashlytics(function1);
        c17219l.advert();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0022 A[Catch: all -> 0x0017, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000f, B:13:0x001a, B:14:0x001c, B:16:0x0022, B:17:0x003d, B:18:0x0041), top: B:25:0x0003, inners: #0 }] */
    public ListenableFuture remoteconfig(C3013l c3013l, Executor executor) {
        ListenableFuture listenableFuture;
        synchronized (this.subs) {
            ListenableFuture listenableFuture2 = (ListenableFuture) this.firebase;
            if (listenableFuture2 == null || !listenableFuture2.isDone()) {
                if (((ListenableFuture) this.firebase) == null) {
                    this.firebase = AbstractC7151l.billing(((C18595l) this.isPro).ad(AbstractC6854l.yandex(new C16948l(this)), (ExecutorC1688l) this.purchase));
                }
                listenableFuture = (ListenableFuture) this.firebase;
            } else {
                try {
                    AbstractC7151l.crashlytics((ListenableFuture) this.firebase);
                } catch (ExecutionException unused) {
                    this.firebase = null;
                }
                if (((ListenableFuture) this.firebase) == null) {
                    this.firebase = AbstractC7151l.billing(((C18595l) this.isPro).ad(AbstractC6854l.yandex(new C16948l(this)), (ExecutorC1688l) this.purchase));
                }
                listenableFuture = (ListenableFuture) this.firebase;
            }
            throw th;
        }
        return ((C18595l) this.isPro).ad(AbstractC6854l.yandex(new C7502l(this, listenableFuture, c3013l, executor)), EnumC1535l.f3808l);
    }

    public void subs() {
        for (AbstractC14971l abstractC14971l = (AbstractC14971l) this.mopub; abstractC14971l != null; abstractC14971l = abstractC14971l.f29460l) {
            abstractC14971l.mo3066l();
            if (abstractC14971l.f29459l) {
                C7661l c7661l = AbstractC3068l.yandex;
                if (!abstractC14971l.f29462l) {
                    AbstractC0081l.crashlytics("autoInvalidateInsertedNode called on unattached node");
                }
                AbstractC3068l.yandex(abstractC14971l, -1, 1);
            }
            if (abstractC14971l.f29455l) {
                AbstractC3068l.crashlytics(abstractC14971l);
            }
            abstractC14971l.f29459l = false;
            abstractC14971l.f29455l = false;
        }
    }

    public String toString() {
        switch (this.yandex) {
            case 3:
                StringBuilder sb = new StringBuilder("[");
                AbstractC14971l abstractC14971l = (AbstractC14971l) this.mopub;
                C13924l c13924l = (C13924l) this.billing;
                if (abstractC14971l == c13924l) {
                    sb.append("]");
                } else {
                    while (abstractC14971l != null && abstractC14971l != c13924l) {
                        sb.append(String.valueOf(abstractC14971l));
                        if (abstractC14971l.f29460l == c13924l) {
                            sb.append("]");
                        } else {
                            sb.append(",");
                            abstractC14971l = abstractC14971l.f29460l;
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public AbstractC12570l vip(Uri uri) throws IOException {
        C1641l c1641l = (C1641l) this.amazon;
        String str = (String) this.loadAd;
        C2830l c2830l = (C2830l) this.billing;
        try {
            try {
                C18420l c18420l = (C18420l) this.admob;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5);
                sb.append("Read ");
                sb.append(str);
                RunnableC9543l runnableC9543lTapsense = c18420l.tapsense(sb.toString());
                try {
                    InputStream inputStreamRemoteconfig = AbstractC6660l.remoteconfig(c2830l.loadAd(uri));
                    try {
                        AbstractC0288l abstractC0288lYandex = ((C4194l) ((InterfaceC1400l) c1641l.yandex.subscription(7))).yandex(inputStreamRemoteconfig, c1641l.loadAd);
                        if (inputStreamRemoteconfig != null) {
                            inputStreamRemoteconfig.close();
                        }
                        runnableC9543lTapsense.close();
                        return abstractC0288lYandex;
                    } catch (Throwable th) {
                        if (inputStreamRemoteconfig != null) {
                            try {
                                inputStreamRemoteconfig.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        runnableC9543lTapsense.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (FileNotFoundException e) {
                C1381l c1381lLoadAd = c2830l.loadAd(uri);
                if (((InterfaceC14033l) c1381lLoadAd.f3513l).loadAd((Uri) c1381lLoadAd.f3514l)) {
                    throw e;
                }
                return c1641l.yandex;
            }
        } catch (IOException e2) {
            throw AbstractC14760l.admob(c2830l, uri, e2, str);
        }
    }

    public C18289l(String str, C5113l c5113l, C1641l c1641l, Executor executor, C2830l c2830l, C13464l c13464l, C18420l c18420l) {
        this.yandex = 5;
        this.subs = new Object();
        this.isPro = new C18595l(22);
        this.firebase = null;
        this.loadAd = str;
        this.crashlytics = AbstractC7151l.billing(c5113l);
        this.amazon = c1641l;
        this.purchase = new ExecutorC1688l(executor);
        this.billing = c2830l;
        this.mopub = c13464l;
        this.admob = c18420l;
    }

    public C18289l(C3654l c3654l) {
        this.yandex = 3;
        this.loadAd = c3654l;
        C15214l c15214l = new C15214l();
        c15214l.f29457l = -1;
        this.crashlytics = c15214l;
        C11103l c11103l = new C11103l(c3654l);
        this.amazon = c11103l;
        this.purchase = c11103l;
        C13924l c13924l = c11103l.f22307l;
        this.billing = c13924l;
        this.mopub = c13924l;
        this.isPro = new C17893l(0, new InterfaceC17242l[16]);
    }

    public /* synthetic */ C18289l(int i) {
        this.yandex = i;
    }

    public C18289l(C17219l c17219l, C16328l c16328l, C0554l c0554l, Function1 function1, C5719l c5719l, C10312l c10312l, Function0 function0, InterfaceC3114l interfaceC3114l, Function1 function2) {
        this.yandex = 0;
        this.crashlytics = c17219l;
        this.amazon = c16328l;
        this.purchase = c0554l;
        this.billing = function1;
        this.admob = c5719l;
        this.subs = c10312l;
        this.isPro = function0;
        this.firebase = interfaceC3114l;
        this.mopub = function2;
        this.loadAd = c17219l;
    }
}
