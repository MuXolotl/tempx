package defpackage;

import java.util.TreeMap;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lًؖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7796l implements InterfaceC14762l {
    public C7504l crashlytics;
    public long loadAd;
    public AbstractC18643l yandex;

    public static String amazon(AbstractC18643l abstractC18643l) {
        C11489l.yandex.getClass();
        return (((Boolean) C11489l.subs.yandex()).booleanValue() && (abstractC18643l instanceof AudioTrack)) ? AbstractC16676l.admob((AudioTrack) abstractC18643l) : abstractC18643l.getCrashlytics();
    }

    public static String purchase(AbstractC18643l abstractC18643l) {
        C11489l.yandex.getClass();
        if (!((Boolean) C11489l.admob.yandex()).booleanValue() || !(abstractC18643l instanceof AudioTrack)) {
            return abstractC18643l.getLoadAd();
        }
        AudioTrack audioTrack = (AudioTrack) abstractC18643l;
        String str = audioTrack.ads;
        int length = (str == null ? "" : str).length();
        String str2 = audioTrack.amazon;
        if (length <= 0) {
            return str2;
        }
        return str2 + " (" + str + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC14762l
    public final void crashlytics(long j) {
        AbstractC18643l abstractC18643l = this.yandex;
        long j2 = j / 1000;
        long jCurrentTimeMillis = this.loadAd;
        C11489l c11489l = C11489l.yandex;
        c11489l.getClass();
        C8634l c8634l = C11489l.billing;
        InterfaceC13922l interfaceC13922l = C11489l.loadAd[3];
        if (!((Boolean) c8634l.pro(c11489l)).booleanValue() || abstractC18643l == 0 || AbstractC1214l.loadAd(abstractC18643l)) {
            return;
        }
        InterfaceC0042l interfaceC0042l = abstractC18643l instanceof InterfaceC0042l ? (InterfaceC0042l) abstractC18643l : null;
        if ((interfaceC0042l == null || !interfaceC0042l.loadAd()) && j2 >= ((long) abstractC18643l.vip()) / 2000) {
            String strAmazon = amazon(abstractC18643l);
            String strPurchase = purchase(abstractC18643l);
            long jVip = ((long) abstractC18643l.vip()) / 1000;
            abstractC18643l.getYandex();
            String strFirebase = abstractC18643l.firebase();
            AbstractC4340l.yandex();
            String string = AbstractC4340l.yandex.getString("sessionKey", null);
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            long j3 = jCurrentTimeMillis / 1000;
            if (string != null) {
                TreeMap treeMap = new TreeMap();
                treeMap.put("method", "track.scrobble");
                treeMap.put("api_key", "4085c85b9f48c43c0d86c4223bbd8458");
                treeMap.put("sk", string);
                treeMap.put("artist[0]", strAmazon);
                treeMap.put("track[0]", strPurchase);
                if (strFirebase != null) {
                    treeMap.put("album[0]", strFirebase);
                }
                treeMap.put("timestamp[0]", String.valueOf(j3));
                if (jVip != -1) {
                    treeMap.put("duration", String.valueOf(jVip));
                }
                treeMap.put("api_sig", AbstractC4340l.crashlytics(treeMap));
                treeMap.put("format", "json");
                VKXApplication.Companion companion = VKXApplication.f36628l;
                C11610l c11610l = AbstractC3629l.yandex;
                if (c11610l == null) {
                    c11610l = null;
                }
                C11644l c11644l = new C11644l(28);
                c11644l.m3157l("https://ws.audioscrobbler.com/2.0/");
                String strLoadAd = AbstractC4340l.loadAd(treeMap);
                C11155l c11155l = C12105l.amazon;
                c11644l.m3145l("POST", C15655l.loadAd(strLoadAd, AbstractC0775l.m674strictfp("application/x-www-form-urlencoded")));
                c11610l.yandex(new C17032l(c11644l)).purchase(new C16367l(9));
            }
            this.yandex = null;
        }
    }

    @Override // defpackage.InterfaceC14762l
    public final void loadAd(EnumC11447l enumC11447l) {
        if (enumC11447l == EnumC11447l.f23033l) {
            this.yandex = null;
            this.loadAd = 0L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC14762l
    public final void yandex(AbstractC18643l abstractC18643l, AbstractC18643l abstractC18643l2) {
        if (AbstractC1214l.loadAd(abstractC18643l)) {
            return;
        }
        InterfaceC0042l interfaceC0042l = abstractC18643l instanceof InterfaceC0042l ? (InterfaceC0042l) abstractC18643l : null;
        if (interfaceC0042l == null || !interfaceC0042l.loadAd()) {
            this.yandex = abstractC18643l;
            this.loadAd = System.currentTimeMillis();
            C11489l c11489l = C11489l.yandex;
            c11489l.getClass();
            C8634l c8634l = C11489l.mopub;
            InterfaceC13922l interfaceC13922l = C11489l.loadAd[4];
            if (((Boolean) c8634l.pro(c11489l)).booleanValue()) {
                C7504l c7504l = this.crashlytics;
                if (c7504l != null) {
                    c7504l.ads(null);
                }
                VKXApplication vKXApplication = VKXApplication.f36631l;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                this.crashlytics = AbstractC10999l.mopub(vKXApplication, null, 0, new C8036l(this, abstractC18643l, abstractC18643l2, null, 14), 3);
            }
        }
    }
}
