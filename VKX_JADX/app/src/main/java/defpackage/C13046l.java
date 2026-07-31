package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLDecoder;
import java.nio.file.ClosedWatchServiceException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lْؐۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13046l {
    public List admob;
    public final C4481l amazon;
    public boolean billing;
    public final C10038l crashlytics;
    public C14187l firebase;
    public final C8688l isPro;
    public final C1770l loadAd;
    public ClassLoader mopub;
    public final ReentrantReadWriteLock purchase;
    public final C8688l remoteconfig;
    public final C18163l smaato;
    public final ArrayList subs;
    public final C18480l yandex;

    public C13046l(C18480l c18480l, C15079l c15079l) {
        this.yandex = c18480l;
        C10038l c10038l = (C10038l) c18480l.f36084l;
        C1770l c1770l = (C1770l) c10038l.f20465l;
        this.loadAd = c1770l;
        this.crashlytics = c10038l;
        C4481l c4481l = new C4481l();
        Runtime.getRuntime().availableProcessors();
        c4481l.yandex = 1000L;
        c4481l.loadAd = 5000L;
        c4481l.crashlytics = new ArrayList();
        c4481l.amazon = 45;
        c15079l.invoke(c4481l);
        this.amazon = c4481l;
        this.purchase = new ReentrantReadWriteLock();
        List list = C2580l.f5619l;
        this.admob = list;
        C18396l c18396lM1204l = ((C2494l) c10038l.f20466l).m1204l("ktor.deployment.watch");
        List listIsVip = c18396lM1204l != null ? c18396lM1204l.isVip() : null;
        this.subs = AbstractC16901l.m4232new(listIsVip != null ? listIsVip : list, (List) c18480l.f36087l);
        this.isPro = new C8688l(new C3321l(29));
        this.firebase = new C14187l(c10038l, c18480l.f36085l, c1770l, (InterfaceC12932l) c18480l.f36089l, new C0059l(0, 2, C13046l.class, this, "engine", "getEngine()Lio/ktor/server/engine/ApplicationEngine;"));
        this.smaato = new C18163l(c10038l, c1770l, c18480l.f36085l, c4481l, new C6335l(0, this, C13046l.class, "currentApplication", "currentApplication()Lio/ktor/server/application/Application;", 0, 0, 24));
        this.remoteconfig = new C8688l(new C8241l(0));
    }

    public static WatchService yandex() {
        try {
            return FileSystems.getDefault().newWatchService();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public final ArrayList admob() {
        InterfaceC6272l interfaceC6272l = (InterfaceC6272l) this.crashlytics.f20462l;
        try {
            List list = this.admob;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC3984l.license(arrayList, ((WatchKey) it.next()).pollEvents());
            }
            if (!arrayList.isEmpty()) {
                interfaceC6272l.firebase("Changes in application detected.");
                int size = arrayList.size();
                while (true) {
                    Thread.sleep(200L);
                    List list2 = this.admob;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        AbstractC3984l.license(arrayList2, ((WatchKey) it2.next()).pollEvents());
                    }
                    if (arrayList2.isEmpty()) {
                        break;
                    }
                    interfaceC6272l.mopub("Waiting for more changes.");
                    size += arrayList2.size();
                }
                interfaceC6272l.mopub("Changes to " + size + " files caused application restart.");
                Iterator it3 = AbstractC16901l.m4247try(arrayList, 5).iterator();
                while (it3.hasNext()) {
                    interfaceC6272l.yandex(((WatchEvent) it3.next()).context());
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            interfaceC6272l.isPro("Watch service was interrupted", e);
            return null;
        } catch (ClosedWatchServiceException e2) {
            interfaceC6272l.isPro("Watch service was closed", e2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:94:0x025e  */
    public final C8195l amazon() throws IOException {
        boolean z;
        WatchEvent.Modifier modifier;
        WatchKey watchKeyRegister;
        Object c18435l;
        char c;
        boolean z2;
        boolean zAppmetrica;
        C10038l c10038l = this.crashlytics;
        InterfaceC6272l interfaceC6272l = (InterfaceC6272l) c10038l.f20462l;
        ClassLoader c16006l = (ClassLoader) c10038l.f20463l;
        if (this.yandex.f36085l) {
            ArrayList arrayList = this.subs;
            if (arrayList.isEmpty()) {
                interfaceC6272l.firebase("No ktor.deployment.watch patterns specified, automatic reload is not active.");
            } else if ((c16006l instanceof URLClassLoader) || c16006l.getClass().getName().equals("jdk.internal.loader.ClassLoaders$AppClassLoader")) {
                Set setYandex = AbstractC10409l.yandex(c16006l);
                String parent = new File(System.getProperty("java.home")).getParent();
                Set set = setYandex;
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((URL) it.next()).getFile());
                }
                interfaceC6272l.mopub("Java Home: " + parent);
                StringBuilder sb = new StringBuilder("Class Loader: ");
                sb.append(c16006l);
                sb.append(": ");
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    z = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (!AbstractC16648l.isVip(((String) next).toString(), parent, false)) {
                        arrayList3.add(next);
                    }
                }
                sb.append(arrayList3);
                interfaceC6272l.mopub(sb.toString());
                char c2 = 2;
                List listRemoteconfig = AbstractC14055l.remoteconfig(C10038l.class, AbstractC10598l.class, C2759l.class, Function1.class, InterfaceC6272l.class, InterfaceC9354l.class, InterfaceC14189l.class, C17535l.class);
                HashSet hashSet = new HashSet();
                Iterator it3 = listRemoteconfig.iterator();
                while (it3.hasNext()) {
                    URL location = ((Class) it3.next()).getProtectionDomain().getCodeSource().getLocation();
                    if (location != null) {
                        hashSet.add(location);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : set) {
                    URL url = (URL) obj;
                    if (hashSet.contains(url)) {
                        c = c2;
                    } else {
                        if (!arrayList.isEmpty()) {
                            Iterator it4 = arrayList.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    c = c2;
                                    z = false;
                                    break;
                                }
                                c = c2;
                                String str = (String) it4.next();
                                String path = url.getPath();
                                if (path == null) {
                                    zAppmetrica = z;
                                } else {
                                    String strDecode = URLDecoder.decode(path, "utf-8");
                                    char c3 = File.separatorChar;
                                    zAppmetrica = AbstractC12024l.appmetrica(strDecode.replace(c3, '/'), str.replace(c3, '/'), true);
                                }
                                if (zAppmetrica) {
                                    z = true;
                                    break;
                                }
                                c2 = c;
                                z = false;
                            }
                        } else {
                            c = c2;
                        }
                        if (z) {
                            String path2 = url.getPath();
                            if (path2 == null) {
                                path2 = "";
                            }
                            z2 = AbstractC16648l.isVip(path2, parent, false) ? false : true;
                        }
                        if (z2) {
                            arrayList4.add(obj);
                        }
                        c2 = c;
                        z = false;
                    }
                    if (z2) {
                        arrayList4.add(obj);
                    }
                    c2 = c;
                    z = false;
                }
                char c4 = c2;
                if (arrayList4.isEmpty()) {
                    interfaceC6272l.firebase("No ktor.deployment.watch patterns match classpath entries, automatic reload is not active");
                } else {
                    HashSet hashSet2 = new HashSet();
                    Iterator it5 = arrayList4.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        String path3 = ((URL) it5.next()).getPath();
                        if (path3 != null) {
                            try {
                                c18435l = new File(URLDecoder.decode(path3, "utf-8")).toPath();
                            } catch (Throwable th) {
                                c18435l = new C18435l(th);
                            }
                            Path pathIsPro = C17132l.isPro(c18435l instanceof C18435l ? null : c18435l);
                            if (pathIsPro != null && Files.exists(pathIsPro, new LinkOption[0])) {
                                C11417l c11417l = new C11417l(hashSet2);
                                if (Files.isDirectory(pathIsPro, new LinkOption[0])) {
                                    Files.walkFileTree(pathIsPro, c11417l);
                                }
                            }
                        }
                    }
                    Iterator it6 = hashSet2.iterator();
                    while (it6.hasNext()) {
                        interfaceC6272l.mopub("Watching " + C17132l.isPro(it6.next()) + " for changes.");
                    }
                    ThreadLocal threadLocal = AbstractC0891l.yandex;
                    if (System.getenv("ANDROID_DATA") != null) {
                        modifier = null;
                    } else {
                        try {
                            Class<?> cls = Class.forName("com.sun.nio.file.SensitivityWatchEventModifier");
                            Object obj2 = cls.getField("HIGH").get(cls);
                            if (obj2 instanceof WatchEvent.Modifier) {
                                modifier = (WatchEvent.Modifier) obj2;
                            } else {
                                modifier = null;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    WatchEvent.Modifier[] modifierArr = modifier != null ? new WatchEvent.Modifier[]{modifier} : new WatchEvent.Modifier[0];
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it7 = hashSet2.iterator();
                    while (it7.hasNext()) {
                        Path pathIsPro2 = C17132l.isPro(it7.next());
                        WatchService watchServiceCrashlytics = C8876l.crashlytics(this.remoteconfig.getValue());
                        if (watchServiceCrashlytics != null) {
                            WatchEvent.Kind<?>[] kindArr = new WatchEvent.Kind[3];
                            kindArr[0] = StandardWatchEventKinds.ENTRY_CREATE;
                            kindArr[1] = StandardWatchEventKinds.ENTRY_DELETE;
                            kindArr[c4] = StandardWatchEventKinds.ENTRY_MODIFY;
                            watchKeyRegister = pathIsPro2.register(watchServiceCrashlytics, kindArr, (WatchEvent.Modifier[]) Arrays.copyOf(modifierArr, modifierArr.length));
                        } else {
                            watchKeyRegister = null;
                        }
                        if (watchKeyRegister != null) {
                            arrayList5.add(watchKeyRegister);
                        }
                    }
                    this.admob = arrayList5;
                    c16006l = new C16006l(arrayList4, c16006l);
                }
            } else {
                interfaceC6272l.remoteconfig("Auto-reload is disabled: application is loaded by " + c16006l.getClass().getName() + ", which is not a standard URLClassLoader. This typically happens when running inside a fat-JAR (e.g. Spring Boot Launcher, Amper). Set ktor.development=false to suppress this warning.");
            }
        } else {
            interfaceC6272l.firebase("Autoreload is disabled because the development mode is off.");
        }
        Thread threadCurrentThread = Thread.currentThread();
        ClassLoader contextClassLoader = threadCurrentThread.getContextClassLoader();
        threadCurrentThread.setContextClassLoader(c16006l);
        try {
            return new C8195l(subs(c16006l), c16006l);
        } finally {
            threadCurrentThread.setContextClassLoader(contextClassLoader);
        }
    }

    public final void billing() {
        C14187l c14187l = this.firebase;
        ClassLoader classLoader = this.mopub;
        this.firebase = null;
        this.mopub = null;
        if (c14187l != null) {
            firebase(AbstractC2749l.mopub, c14187l);
            try {
                mopub(c14187l, classLoader);
            } catch (Throwable th) {
                ((InterfaceC6272l) this.crashlytics.f20462l).amazon("Failed to destroy application instance.", th);
            }
            firebase(AbstractC2749l.admob, c14187l);
        }
        Iterator it = this.admob.iterator();
        while (it.hasNext()) {
            C8876l.loadAd(it.next()).cancel();
        }
        this.admob = new ArrayList();
    }

    public final void crashlytics() {
        try {
            WatchService watchServiceCrashlytics = C8876l.crashlytics(this.remoteconfig.getValue());
            if (watchServiceCrashlytics != null) {
                watchServiceCrashlytics.close();
                Unit unit = Unit.INSTANCE;
            }
        } catch (Throwable unused) {
        }
    }

    public final void firebase(C0847l c0847l, C14187l c14187l) {
        try {
            this.loadAd.vip(c0847l, c14187l);
        } catch (Throwable th) {
            ((InterfaceC6272l) this.crashlytics.f20462l).isPro("One or more of the handlers thrown an exception", th);
        }
    }

    public final void isPro() {
        C14187l c14187l = this.firebase;
        ClassLoader classLoader = this.mopub;
        List list = this.admob;
        try {
            C8195l c8195lAmazon = amazon();
            C14187l c14187l2 = (C14187l) c8195lAmazon.f17098l;
            ClassLoader classLoader2 = (ClassLoader) c8195lAmazon.f17097l;
            if (c14187l != null) {
                firebase(AbstractC2749l.mopub, c14187l);
                try {
                    mopub(c14187l, classLoader);
                } catch (Throwable th) {
                    ((InterfaceC6272l) this.crashlytics.f20462l).amazon("Failed to destroy previous application instance.", th);
                }
                firebase(AbstractC2749l.admob, c14187l);
            }
            if (this.admob != list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C8876l.loadAd(it.next()).cancel();
                }
            }
            this.firebase = c14187l2;
            this.mopub = classLoader2;
        } catch (Throwable th2) {
            if (this.admob != list) {
                Iterator it2 = this.admob.iterator();
                while (it2.hasNext()) {
                    C8876l.loadAd(it2.next()).cancel();
                }
                this.admob = list;
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object loadAd(String str, C7045l c7045l, AbstractC0283l abstractC0283l) {
        C16140l c16140l;
        List list;
        Throwable th;
        String str2;
        if (abstractC0283l instanceof C16140l) {
            c16140l = (C16140l) abstractC0283l;
            int i = c16140l.f31604l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c16140l.f31604l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c16140l = new C16140l(this, abstractC0283l);
            }
        } else {
            c16140l = new C16140l(this, abstractC0283l);
        }
        Object obj = c16140l.f31607l;
        int i2 = c16140l.f31604l;
        if (i2 != 0) {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = c16140l.f31605l;
            str2 = c16140l.f31606l;
            try {
                AbstractC2829l.crashlytics(obj);
                list.remove(str2);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                list.remove(str2);
                throw th;
            }
        }
        AbstractC2829l.crashlytics(obj);
        ThreadLocal threadLocal = AbstractC0891l.yandex;
        Object arrayList = threadLocal.get();
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            threadLocal.set(arrayList);
        }
        List list2 = (List) arrayList;
        if (list2.contains(str)) {
            C8936l.subs(AbstractC15560l.Signature("Module startup is already in progress for function ", str, " (recursive module startup from module main?)"));
            return null;
        }
        list2.add(str);
        try {
            c16140l.f31606l = str;
            c16140l.f31605l = list2;
            c16140l.f31604l = 1;
            Object objInvoke = c7045l.invoke(c16140l);
            Object obj2 = EnumC9342l.f19165l;
            if (objInvoke == obj2) {
                return obj2;
            }
            str2 = str;
            list = list2;
            list.remove(str2);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            list = list2;
            th = th3;
            str2 = str;
            list.remove(str2);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [lٕۢٝ] */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final void mopub(C14187l c14187l, ClassLoader classLoader) throws IOException {
        C16006l c16006l;
        ?? r0 = 0;
        C16006l c16006l2 = null;
        try {
            AbstractC10999l.subs(C17218l.f33421l, new C18731l(this, c14187l, r0, 18));
        } finally {
            if (classLoader instanceof C16006l) {
                c16006l = (C16006l) classLoader;
            }
            if (r0 != 0) {
                r0 = c16006l;
                r0.close();
            }
            r0 = c16006l;
        }
    }

    public final C14187l purchase() {
        ArrayList arrayListAdmob;
        ReentrantReadWriteLock reentrantReadWriteLock = this.purchase;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            C14187l c14187l = this.firebase;
            if (c14187l == null) {
                throw new IllegalStateException("EmbeddedServer was stopped");
            }
            if (this.yandex.f36085l && (arrayListAdmob = admob()) != null && !arrayListAdmob.isEmpty()) {
                ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
                int i = 0;
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    lock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    isPro();
                } catch (Throwable th) {
                    try {
                        ((InterfaceC6272l) this.crashlytics.f20462l).amazon("Auto-reload failed; continuing to serve the previously loaded application.", th);
                    } catch (Throwable th2) {
                        while (i < readHoldCount) {
                            lock2.lock();
                            i++;
                        }
                        writeLock.unlock();
                        throw th2;
                    }
                }
                Unit unit = Unit.INSTANCE;
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                c14187l = this.firebase;
                if (c14187l == null) {
                    throw new IllegalStateException("EmbeddedServer was stopped");
                }
            }
            lock.unlock();
            return c14187l;
        } catch (Throwable th3) {
            lock.unlock();
            throw th3;
        }
    }

    public final C14187l subs(ClassLoader classLoader) throws Throwable {
        C1770l c1770l;
        C14187l c14187l;
        C14187l c14187l2;
        boolean z = this.billing;
        C1770l c1770l2 = this.loadAd;
        if (z || (c14187l2 = this.firebase) == null) {
            C18480l c18480l = this.yandex;
            c1770l = c1770l2;
            c14187l = new C14187l(this.crashlytics, c18480l.f36085l, c1770l2, (InterfaceC12932l) c18480l.f36089l, new C0059l(0, 3, C13046l.class, this, "engine", "getEngine()Lio/ktor/server/engine/ApplicationEngine;"));
        } else {
            this.billing = true;
            c14187l = c14187l2;
            c1770l = c1770l2;
        }
        firebase(AbstractC2749l.yandex, c14187l);
        InterfaceC14029l interfaceC14029l = null;
        try {
            AbstractC10999l.subs(C17218l.f33421l, new C11039l(new C10928l(this, c14187l, classLoader, interfaceC14029l, 3), interfaceC14029l, 24));
            ThreadLocal threadLocal = AbstractC0891l.yandex;
            List list = (List) threadLocal.get();
            if (list != null && list.isEmpty()) {
                threadLocal.remove();
            }
            c1770l.vip(AbstractC2749l.crashlytics, c14187l);
            c1770l.vip(AbstractC2749l.amazon, c14187l);
            return c14187l;
        } catch (Throwable th) {
            ThreadLocal threadLocal2 = AbstractC0891l.yandex;
            List list2 = (List) threadLocal2.get();
            if (list2 != null && list2.isEmpty()) {
                threadLocal2.remove();
            }
            throw th;
        }
    }
}
