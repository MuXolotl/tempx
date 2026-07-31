package defpackage;

import ealvatag.tag.id3.framebody.AbstractID3v2FrameBody;
import ealvatag.tag.id3.framebody.FrameBodyCOMM;
import ealvatag.tag.id3.framebody.FrameBodyTIPL;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: lٍؙّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6356l {
    public final int Signature;
    public final long adcel;
    public final boolean admob;
    public final boolean ads;
    public final HashMap amazon;
    public final boolean billing;
    public final HashMap crashlytics;
    public final boolean firebase;
    public final boolean isPro;
    public final int license;
    public final HashMap loadAd;
    public boolean metrica;
    public final boolean mopub;
    public final boolean purchase;
    public final boolean remoteconfig;
    public final boolean smaato;
    public final boolean startapp;
    public final boolean subs;
    public final boolean subscription = true;
    public final int tapsense;
    public final byte vip;
    public final HashMap yandex;
    public static final ConcurrentHashMap pro = new ConcurrentHashMap();
    public static final String ad = "default";
    public static final ReentrantLock advert = new ReentrantLock();

    public C6356l() {
        this.tapsense = 1;
        this.Signature = 3;
        this.yandex = new HashMap();
        this.loadAd = new HashMap();
        this.crashlytics = new HashMap();
        this.amazon = new HashMap();
        this.purchase = true;
        this.billing = true;
        this.mopub = true;
        this.admob = true;
        this.subs = true;
        this.isPro = true;
        this.firebase = true;
        this.smaato = true;
        this.remoteconfig = true;
        this.vip = (byte) 1;
        this.metrica = false;
        this.startapp = true;
        this.adcel = 4194304L;
        this.license = 2;
        this.ads = true;
        this.tapsense = 3;
        this.Signature = 3;
        this.yandex = new HashMap();
        this.purchase = true;
        this.billing = true;
        this.mopub = true;
        this.admob = true;
        this.subs = true;
        this.isPro = true;
        this.firebase = true;
        this.smaato = true;
        this.loadAd = new HashMap();
        this.crashlytics = new HashMap();
        this.amazon = new HashMap();
        this.remoteconfig = true;
        this.vip = (byte) 1;
        this.metrica = false;
        this.startapp = true;
        this.adcel = 5000000L;
        this.license = 2;
        this.ads = false;
        if (C10133l.f20639l == null) {
            synchronized (AbstractC7942l.class) {
                try {
                    if (C10133l.f20639l == null) {
                        C10133l.f20639l = new C10133l();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        AbstractC10199l it = C10133l.f20639l.f20640l.keySet().iterator();
        while (it.hasNext()) {
            this.loadAd.put((String) it.next(), Boolean.TRUE);
        }
        yandex(FrameBodyCOMM.class, "ultimix");
        yandex(FrameBodyCOMM.class, "dance");
        yandex(FrameBodyCOMM.class, "mix");
        yandex(FrameBodyCOMM.class, "remix");
        yandex(FrameBodyCOMM.class, "rmx");
        yandex(FrameBodyCOMM.class, "live");
        yandex(FrameBodyCOMM.class, "cover");
        yandex(FrameBodyCOMM.class, "soundtrack");
        yandex(FrameBodyCOMM.class, "version");
        yandex(FrameBodyCOMM.class, "acoustic");
        yandex(FrameBodyCOMM.class, "original");
        yandex(FrameBodyCOMM.class, "cd");
        yandex(FrameBodyCOMM.class, "extended");
        yandex(FrameBodyCOMM.class, "vocal");
        yandex(FrameBodyCOMM.class, "unplugged");
        yandex(FrameBodyCOMM.class, "acapella");
        yandex(FrameBodyCOMM.class, "edit");
        yandex(FrameBodyCOMM.class, "radio");
        yandex(FrameBodyCOMM.class, "original");
        yandex(FrameBodyCOMM.class, "album");
        yandex(FrameBodyCOMM.class, "studio");
        yandex(FrameBodyCOMM.class, "instrumental");
        yandex(FrameBodyCOMM.class, "unedited");
        yandex(FrameBodyCOMM.class, "karoke");
        yandex(FrameBodyCOMM.class, "quality");
        yandex(FrameBodyCOMM.class, "uncensored");
        yandex(FrameBodyCOMM.class, "clean");
        yandex(FrameBodyCOMM.class, "dirty");
        yandex(FrameBodyTIPL.class, "f.");
        yandex(FrameBodyTIPL.class, "feat");
        yandex(FrameBodyTIPL.class, "feat.");
        yandex(FrameBodyTIPL.class, "featuring");
        yandex(FrameBodyTIPL.class, "ftng");
        yandex(FrameBodyTIPL.class, "ftng.");
        yandex(FrameBodyTIPL.class, "ft.");
        yandex(FrameBodyTIPL.class, "ft");
        for (String str : (String[]) C18595l.ads().f36317l) {
            yandex(FrameBodyCOMM.class, str);
        }
        loadAd("v.", "vs.");
        loadAd("vs.", "vs.");
        loadAd("versus", "vs.");
        loadAd("f.", "feat.");
        loadAd("feat", "feat.");
        loadAd("featuring", "feat.");
        loadAd("ftng.", "feat.");
        loadAd("ftng", "feat.");
        loadAd("ft.", "feat.");
        loadAd("ft", "feat.");
        this.crashlytics.put("(", ")");
        this.crashlytics.put("[", "]");
        this.crashlytics.put("{", "}");
        this.crashlytics.put("<", ">");
    }

    public static C6356l amazon() {
        String str = ad;
        ReentrantLock reentrantLock = advert;
        reentrantLock.lock();
        try {
            ConcurrentHashMap concurrentHashMap = pro;
            C6356l c6356l = (C6356l) concurrentHashMap.get(str);
            if (c6356l == null) {
                c6356l = new C6356l();
                concurrentHashMap.put(str, c6356l);
            }
            return c6356l;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static C9553l crashlytics() {
        if (amazon().license != 0) {
            return new C9553l();
        }
        throw null;
    }

    public final void loadAd(String str, String str2) {
        this.amazon.put(str, str2);
    }

    public final void yandex(Class cls, String str) {
        LinkedList linkedList;
        if (!AbstractID3v2FrameBody.class.isAssignableFrom(cls)) {
            C8339l.metrica(AbstractC0653l.startapp(cls, "Invalid class type. Must be AbstractId3v2FrameBody "));
            return;
        }
        if (str == null || str.length() <= 0) {
            return;
        }
        HashMap map = this.yandex;
        if (map.containsKey(cls)) {
            linkedList = (LinkedList) map.get(cls);
        } else {
            linkedList = new LinkedList();
            map.put(cls, linkedList);
        }
        linkedList.add(str);
    }
}
