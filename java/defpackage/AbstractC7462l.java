package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؚۗۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7462l {
    public static final LinkedHashMap loadAd;
    public static final File yandex;

    static {
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        File file = new File(vKXApplication.getDir("devdb", 0), "OnDevice_Blacklist.dat");
        yandex = file;
        loadAd = new LinkedHashMap();
        if (!file.exists()) {
            file.createNewFile();
        }
        AbstractC2030l.smaato(file, new C1306l(16));
    }

    public static void crashlytics() throws IOException {
        Set setEntrySet = loadAd.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            Map.Entry entry = (Map.Entry) obj;
            if (((CharSequence) entry.getKey()).length() > 0 && ((CharSequence) entry.getValue()).length() > 0) {
                arrayList.add(obj);
            }
        }
        AbstractC2030l.metrica(yandex, AbstractC16901l.m4210case(arrayList, "\n", null, null, new C1306l(17), 30));
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC12832l.mopub(C10088l.yandex, vKXApplication);
    }

    public static int loadAd(AudioTrack audioTrack) {
        AudioAlbum audioAlbum;
        C10892l c10892l = C10892l.yandex;
        c10892l.getClass();
        C8634l c8634l = C10892l.remoteconfig;
        InterfaceC13922l[] interfaceC13922lArr = C10892l.loadAd;
        InterfaceC13922l interfaceC13922l = interfaceC13922lArr[7];
        if (((Boolean) c8634l.pro(c10892l)).booleanValue() && audioTrack.mopub) {
            return 1;
        }
        C8634l c8634l2 = C10892l.isPro;
        InterfaceC13922l interfaceC13922l2 = interfaceC13922lArr[4];
        if (((Boolean) c8634l2.pro(c10892l)).booleanValue()) {
            if (Pattern.compile("[А-яёЁ]+").matcher(audioTrack.amazon).find()) {
                return 1;
            }
        }
        C8634l c8634l3 = C10892l.firebase;
        InterfaceC13922l interfaceC13922l3 = interfaceC13922lArr[5];
        if (((Boolean) c8634l3.pro(c10892l)).booleanValue()) {
            if (Pattern.compile("[А-яёЁ]+").matcher(audioTrack.yandex).find()) {
                return 1;
            }
        }
        C8634l c8634l4 = C10892l.smaato;
        InterfaceC13922l interfaceC13922l4 = interfaceC13922lArr[6];
        if (((Boolean) c8634l4.pro(c10892l)).booleanValue() && (audioAlbum = audioTrack.vip) != null) {
            if (Pattern.compile("[А-яёЁ]+").matcher(audioAlbum.amazon).find()) {
                return 1;
            }
        }
        List list = audioTrack.startapp;
        LinkedHashMap linkedHashMap = loadAd;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((MainArtist) it.next()).yandex;
                if (str != null && linkedHashMap.containsKey(str)) {
                    return 2;
                }
            }
        }
        List list2 = audioTrack.adcel;
        if (list2 == null) {
            return 3;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            String str2 = ((MainArtist) it2.next()).yandex;
            if (str2 != null && linkedHashMap.containsKey(str2)) {
                return 2;
            }
        }
        return 3;
    }

    public static ArrayList yandex() {
        LinkedHashMap linkedHashMap = loadAd;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new MainArtist((String) entry.getKey(), (String) null, (String) entry.getValue(), (List) null, false, 26));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String str = ((MainArtist) obj).yandex;
            if (str != null && str.length() != 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
