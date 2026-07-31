package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lٓۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC14394l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Executor f28146l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C5807l f28147l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C5762l f28148l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28149l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f28150l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ long f28151l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Context f28152l;

    public /* synthetic */ RunnableC14394l(C5762l c5762l, Context context, Executor executor, int i, C5807l c5807l, long j) {
        this.f28148l = c5762l;
        this.f28152l = context;
        this.f28146l = executor;
        this.f28150l = i;
        this.f28147l = c5807l;
        this.f28151l = j;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x015d  */
    /* JADX WARN: Code duplicated, block: B:45:0x01a8 A[Catch: all -> 0x0205, TryCatch #1 {all -> 0x0205, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005a, B:13:0x0082, B:15:0x00a1, B:22:0x00b3, B:23:0x00da, B:25:0x00e0, B:26:0x00f0, B:28:0x0114, B:29:0x0117, B:31:0x0124, B:32:0x0130, B:33:0x0131, B:34:0x013d, B:35:0x013e, B:36:0x014a, B:37:0x014b, B:41:0x0162, B:43:0x019a, B:60:0x01fa, B:44:0x019e, B:45:0x01a8, B:46:0x01ab, B:50:0x01b0, B:52:0x01b4, B:53:0x01bd, B:55:0x01c1, B:56:0x01ea, B:58:0x01ee, B:59:0x01f2, B:65:0x0204, B:48:0x01ad, B:49:0x01af), top: B:71:0x0030, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b4 A[Catch: all -> 0x0205, TryCatch #1 {all -> 0x0205, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005a, B:13:0x0082, B:15:0x00a1, B:22:0x00b3, B:23:0x00da, B:25:0x00e0, B:26:0x00f0, B:28:0x0114, B:29:0x0117, B:31:0x0124, B:32:0x0130, B:33:0x0131, B:34:0x013d, B:35:0x013e, B:36:0x014a, B:37:0x014b, B:41:0x0162, B:43:0x019a, B:60:0x01fa, B:44:0x019e, B:45:0x01a8, B:46:0x01ab, B:50:0x01b0, B:52:0x01b4, B:53:0x01bd, B:55:0x01c1, B:56:0x01ea, B:58:0x01ee, B:59:0x01f2, B:65:0x0204, B:48:0x01ad, B:49:0x01af), top: B:71:0x0030, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x01bd A[Catch: all -> 0x0205, TryCatch #1 {all -> 0x0205, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005a, B:13:0x0082, B:15:0x00a1, B:22:0x00b3, B:23:0x00da, B:25:0x00e0, B:26:0x00f0, B:28:0x0114, B:29:0x0117, B:31:0x0124, B:32:0x0130, B:33:0x0131, B:34:0x013d, B:35:0x013e, B:36:0x014a, B:37:0x014b, B:41:0x0162, B:43:0x019a, B:60:0x01fa, B:44:0x019e, B:45:0x01a8, B:46:0x01ab, B:50:0x01b0, B:52:0x01b4, B:53:0x01bd, B:55:0x01c1, B:56:0x01ea, B:58:0x01ee, B:59:0x01f2, B:65:0x0204, B:48:0x01ad, B:49:0x01af), top: B:71:0x0030, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x01c1 A[Catch: all -> 0x0205, TryCatch #1 {all -> 0x0205, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005a, B:13:0x0082, B:15:0x00a1, B:22:0x00b3, B:23:0x00da, B:25:0x00e0, B:26:0x00f0, B:28:0x0114, B:29:0x0117, B:31:0x0124, B:32:0x0130, B:33:0x0131, B:34:0x013d, B:35:0x013e, B:36:0x014a, B:37:0x014b, B:41:0x0162, B:43:0x019a, B:60:0x01fa, B:44:0x019e, B:45:0x01a8, B:46:0x01ab, B:50:0x01b0, B:52:0x01b4, B:53:0x01bd, B:55:0x01c1, B:56:0x01ea, B:58:0x01ee, B:59:0x01f2, B:65:0x0204, B:48:0x01ad, B:49:0x01af), top: B:71:0x0030, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x01ea A[Catch: all -> 0x0205, TryCatch #1 {all -> 0x0205, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005a, B:13:0x0082, B:15:0x00a1, B:22:0x00b3, B:23:0x00da, B:25:0x00e0, B:26:0x00f0, B:28:0x0114, B:29:0x0117, B:31:0x0124, B:32:0x0130, B:33:0x0131, B:34:0x013d, B:35:0x013e, B:36:0x014a, B:37:0x014b, B:41:0x0162, B:43:0x019a, B:60:0x01fa, B:44:0x019e, B:45:0x01a8, B:46:0x01ab, B:50:0x01b0, B:52:0x01b4, B:53:0x01bd, B:55:0x01c1, B:56:0x01ea, B:58:0x01ee, B:59:0x01f2, B:65:0x0204, B:48:0x01ad, B:49:0x01af), top: B:71:0x0030, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01ee A[Catch: all -> 0x0205, TryCatch #1 {all -> 0x0205, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005a, B:13:0x0082, B:15:0x00a1, B:22:0x00b3, B:23:0x00da, B:25:0x00e0, B:26:0x00f0, B:28:0x0114, B:29:0x0117, B:31:0x0124, B:32:0x0130, B:33:0x0131, B:34:0x013d, B:35:0x013e, B:36:0x014a, B:37:0x014b, B:41:0x0162, B:43:0x019a, B:60:0x01fa, B:44:0x019e, B:45:0x01a8, B:46:0x01ab, B:50:0x01b0, B:52:0x01b4, B:53:0x01bd, B:55:0x01c1, B:56:0x01ea, B:58:0x01ee, B:59:0x01f2, B:65:0x0204, B:48:0x01ad, B:49:0x01af), top: B:71:0x0030, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x01f2 A[Catch: all -> 0x0205, TryCatch #1 {all -> 0x0205, blocks: (B:7:0x0030, B:9:0x0038, B:11:0x005a, B:13:0x0082, B:15:0x00a1, B:22:0x00b3, B:23:0x00da, B:25:0x00e0, B:26:0x00f0, B:28:0x0114, B:29:0x0117, B:31:0x0124, B:32:0x0130, B:33:0x0131, B:34:0x013d, B:35:0x013e, B:36:0x014a, B:37:0x014b, B:41:0x0162, B:43:0x019a, B:60:0x01fa, B:44:0x019e, B:45:0x01a8, B:46:0x01ab, B:50:0x01b0, B:52:0x01b4, B:53:0x01bd, B:55:0x01c1, B:56:0x01ea, B:58:0x01ee, B:59:0x01f2, B:65:0x0204, B:48:0x01ad, B:49:0x01af), top: B:71:0x0030, inners: #0 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x01c1, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        C16380l c16380lLoadAd;
        switch (this.f28149l) {
            case 0:
                C5762l c5762l = this.f28148l;
                Context context = this.f28152l;
                Executor executor = this.f28146l;
                int i = this.f28150l;
                C5807l c5807l = this.f28147l;
                long j = this.f28151l;
                Trace.beginSection("CX:initAndRetryRecursively");
                try {
                    try {
                        C10203l c10203lCrashlytics = c5762l.crashlytics.crashlytics();
                        if (c10203lCrashlytics == null) {
                            throw new C7410l(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                        }
                        C13316l c13316l = new C13316l(c5762l.amazon, c5762l.purchase);
                        C7542l c7542lYandex = c5762l.crashlytics.yandex();
                        C6921l c6921l = new C6921l(context, c7542lYandex);
                        long jAmazon = c5762l.crashlytics.amazon();
                        if (c5762l.crashlytics.mopub() == null) {
                            throw new C7410l(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                        }
                        C3859l c3859l = new C3859l(context);
                        c5762l.subs = c3859l;
                        C13568l c13568l = new C13568l(c3859l);
                        c5762l.isPro = c13568l;
                        c5762l.mopub = c10203lCrashlytics.yandex(context, c13316l, c7542lYandex, jAmazon, c5762l.crashlytics, c13568l);
                        if (c5762l.crashlytics.purchase() == null) {
                            throw new C7410l(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                        }
                        C0542l c0542l = new C0542l(context, (C9377l) c5762l.mopub.mopub.getValue(), c5762l.mopub.loadAd());
                        c5762l.admob = c0542l;
                        c5762l.isPro.f26580l = c0542l;
                        if (executor instanceof ExecutorC5094l) {
                            ((ExecutorC5094l) executor).billing(c5762l.mopub);
                        }
                        c5762l.yandex.purchase(c5762l.mopub);
                        C7518l c7518l = c5762l.mopub.purchase;
                        c7518l.crashlytics(c5762l.yandex);
                        C2974l c2974l = c5762l.yandex;
                        c5762l.firebase = new C10038l(c2974l, c7518l, c5762l.subs, c5762l.isPro, 7);
                        Iterator it = c2974l.amazon().iterator();
                        while (it.hasNext()) {
                            ((InterfaceC18690l) it.next()).adcel().remoteconfig(c5762l.firebase);
                        }
                        c5762l.vip.admob(c6921l, c5762l.mopub, c5762l.yandex);
                        c5762l.vip.remoteconfig.add(c5762l.admob);
                        c5762l.vip.remoteconfig.add(c5762l.mopub.purchase);
                        c6921l.premium(c5762l.yandex);
                        if (i > 1) {
                            C5762l.purchase(null);
                        }
                        c5762l.crashlytics();
                        c5807l.loadAd(null);
                        Trace.endSection();
                        return;
                    } catch (RuntimeException e) {
                        e = e;
                        C9489l c9489l = new C9489l(j, e);
                        c16380lLoadAd = c5762l.smaato.loadAd(c9489l);
                        C5762l.purchase(c9489l);
                        if (c16380lLoadAd.loadAd || i >= Integer.MAX_VALUE) {
                            synchronized (c5762l.loadAd) {
                                c5762l.startapp = 3;
                                break;
                            }
                            if (c16380lLoadAd.crashlytics) {
                                c5762l.crashlytics();
                                c5807l.loadAd(null);
                            } else if (e instanceof C18281l) {
                                String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((C18281l) e).f35778l;
                                AbstractC5088l.amazon("CameraX", str, e);
                                c5807l.amazon(new C7410l(new C4155l(str)));
                            } else if (e instanceof C7410l) {
                                c5807l.amazon(e);
                            } else {
                                c5807l.amazon(new C7410l(e));
                            }
                        } else {
                            AbstractC5088l.Signature("CameraX", "Retry init. Start time " + j + " current time " + SystemClock.elapsedRealtime(), e);
                            Handler handler = c5762l.purchase;
                            RunnableC14394l runnableC14394l = new RunnableC14394l(c5762l, executor, j, i, context, c5807l);
                            long j2 = c16380lLoadAd.yandex;
                            if (Build.VERSION.SDK_INT >= 28) {
                                AbstractC13950l.m3803catch(handler, runnableC14394l, j2);
                            } else {
                                Message messageObtain = Message.obtain(handler, runnableC14394l);
                                messageObtain.obj = "retry_token";
                                handler.sendMessageDelayed(messageObtain, j2);
                            }
                        }
                        c5762l.vip.mopub();
                    } catch (C7410l e2) {
                        e = e2;
                        C9489l c9489l2 = new C9489l(j, e);
                        c16380lLoadAd = c5762l.smaato.loadAd(c9489l2);
                        C5762l.purchase(c9489l2);
                        if (c16380lLoadAd.loadAd) {
                            synchronized (c5762l.loadAd) {
                                c5762l.startapp = 3;
                                if (c16380lLoadAd.crashlytics) {
                                    c5762l.crashlytics();
                                    c5807l.loadAd(null);
                                } else {
                                    if (e instanceof C18281l) {
                                        String str2 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((C18281l) e).f35778l;
                                        AbstractC5088l.amazon("CameraX", str2, e);
                                        c5807l.amazon(new C7410l(new C4155l(str2)));
                                    } else if (e instanceof C7410l) {
                                        c5807l.amazon(e);
                                    } else {
                                        c5807l.amazon(new C7410l(e));
                                    }
                                    c5762l.vip.mopub();
                                }
                            }
                        } else {
                            synchronized (c5762l.loadAd) {
                                c5762l.startapp = 3;
                                if (c16380lLoadAd.crashlytics) {
                                    c5762l.crashlytics();
                                    c5807l.loadAd(null);
                                } else {
                                    if (e instanceof C18281l) {
                                        String str3 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((C18281l) e).f35778l;
                                        AbstractC5088l.amazon("CameraX", str3, e);
                                        c5807l.amazon(new C7410l(new C4155l(str3)));
                                    } else if (e instanceof C7410l) {
                                        c5807l.amazon(e);
                                    } else {
                                        c5807l.amazon(new C7410l(e));
                                    }
                                    c5762l.vip.mopub();
                                }
                            }
                        }
                    } catch (C18281l e3) {
                        e = e3;
                        C9489l c9489l3 = new C9489l(j, e);
                        c16380lLoadAd = c5762l.smaato.loadAd(c9489l3);
                        C5762l.purchase(c9489l3);
                        if (c16380lLoadAd.loadAd) {
                            synchronized (c5762l.loadAd) {
                                c5762l.startapp = 3;
                                if (c16380lLoadAd.crashlytics) {
                                    c5762l.crashlytics();
                                    c5807l.loadAd(null);
                                } else {
                                    if (e instanceof C18281l) {
                                        String str4 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((C18281l) e).f35778l;
                                        AbstractC5088l.amazon("CameraX", str4, e);
                                        c5807l.amazon(new C7410l(new C4155l(str4)));
                                    } else if (e instanceof C7410l) {
                                        c5807l.amazon(e);
                                    } else {
                                        c5807l.amazon(new C7410l(e));
                                    }
                                    c5762l.vip.mopub();
                                }
                            }
                        } else {
                            synchronized (c5762l.loadAd) {
                                c5762l.startapp = 3;
                                if (c16380lLoadAd.crashlytics) {
                                    c5762l.crashlytics();
                                    c5807l.loadAd(null);
                                } else {
                                    if (e instanceof C18281l) {
                                        String str5 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((C18281l) e).f35778l;
                                        AbstractC5088l.amazon("CameraX", str5, e);
                                        c5807l.amazon(new C7410l(new C4155l(str5)));
                                    } else if (e instanceof C7410l) {
                                        c5807l.amazon(e);
                                    } else {
                                        c5807l.amazon(new C7410l(e));
                                    }
                                    c5762l.vip.mopub();
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
                break;
            default:
                C5762l c5762l2 = this.f28148l;
                Executor executor2 = this.f28146l;
                executor2.execute(new RunnableC14394l(c5762l2, this.f28152l, executor2, this.f28150l + 1, this.f28147l, this.f28151l));
                return;
        }
    }

    public /* synthetic */ RunnableC14394l(C5762l c5762l, Executor executor, long j, int i, Context context, C5807l c5807l) {
        this.f28148l = c5762l;
        this.f28146l = executor;
        this.f28151l = j;
        this.f28150l = i;
        this.f28152l = context;
        this.f28147l = c5807l;
    }
}
