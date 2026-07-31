package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedAttachment;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedAudios;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedItem;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedPlaylists;

/* JADX INFO: renamed from: lًٚۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8103l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f16887l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16888l;

    public /* synthetic */ C8103l(int i, ArrayList arrayList) {
        this.f16888l = i;
        this.f16887l = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f16888l;
        ArrayList<InterfaceC0980l> arrayList = this.f16887l;
        switch (i) {
            case 0:
                AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC9601l.smaato(abstractC9601l, (AbstractC10113l) arrayList.get(i2), 0, 0);
                }
                return Unit.INSTANCE;
            case 1:
                AbstractC10022l abstractC10022l = (AbstractC10022l) obj;
                InterfaceC9354l interfaceC9354lCrashlytics = abstractC10022l.crashlytics();
                for (InterfaceC0980l interfaceC0980l : arrayList) {
                    InterfaceC6272l interfaceC6272l = AbstractC4689l.yandex;
                    if (interfaceC6272l.admob()) {
                        StringBuilder sb = new StringBuilder("Decoding response with ");
                        sb.append(interfaceC0980l);
                        sb.append(" for ");
                        InterfaceC1814l interfaceC1814l = abstractC10022l.loadAd().f27846l;
                        if (interfaceC1814l == null) {
                            interfaceC1814l = null;
                        }
                        sb.append(interfaceC1814l.getUrl());
                        interfaceC6272l.vip(sb.toString());
                    }
                    interfaceC9354lCrashlytics = interfaceC0980l.admob(interfaceC9354lCrashlytics, abstractC10022l.vip());
                }
                return interfaceC9354lCrashlytics;
            case 2:
                AbstractC9601l abstractC9601l2 = (AbstractC9601l) obj;
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C10824l c10824l = (C10824l) arrayList.get(i3);
                    List list = c10824l.loadAd;
                    boolean z = c10824l.admob;
                    if (c10824l.smaato == Integer.MIN_VALUE) {
                        AbstractC14825l.yandex("position() should be called first");
                    }
                    int size3 = list.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        AbstractC10113l abstractC10113l = (AbstractC10113l) list.get(i4);
                        int[] iArr = c10824l.isPro;
                        int i5 = i4 * 2;
                        long jAmazon = C5177l.amazon((((long) iArr[i5]) << 32) | (((long) iArr[i5 + 1]) & 4294967295L), c10824l.crashlytics);
                        if (z) {
                            AbstractC9601l.adcel(abstractC9601l2, abstractC10113l, jAmazon);
                        } else {
                            AbstractC9601l.vip(abstractC9601l2, abstractC10113l, jAmazon);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 3:
                AbstractC9601l abstractC9601l3 = (AbstractC9601l) obj;
                int size4 = arrayList.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    abstractC9601l3.mopub((AbstractC10113l) arrayList.get(i6), 0, 0, 0.0f);
                }
                return Unit.INSTANCE;
            case 4:
                NewsfeedItem newsfeedItem = (NewsfeedItem) obj;
                List list2 = newsfeedItem.vip;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        AudioTrack audioTrack = ((NewsfeedAttachment) it.next()).yandex;
                        if (audioTrack != null) {
                            arrayList.add(audioTrack);
                        }
                    }
                }
                NewsfeedAudios newsfeedAudios = newsfeedItem.isPro;
                if (newsfeedAudios != null) {
                    arrayList.addAll(newsfeedAudios.loadAd);
                }
                List list3 = newsfeedItem.firebase;
                if (list3 != null) {
                    arrayList.addAll(list3);
                }
                return Unit.INSTANCE;
            default:
                NewsfeedItem newsfeedItem2 = (NewsfeedItem) obj;
                List list4 = newsfeedItem2.vip;
                if (list4 != null) {
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        AudioPlaylist audioPlaylist = ((NewsfeedAttachment) it2.next()).loadAd;
                        if (audioPlaylist != null) {
                            arrayList.add(audioPlaylist);
                        }
                    }
                }
                NewsfeedPlaylists newsfeedPlaylists = newsfeedItem2.smaato;
                if (newsfeedPlaylists != null) {
                    arrayList.addAll(newsfeedPlaylists.loadAd);
                }
                return Unit.INSTANCE;
        }
    }
}
