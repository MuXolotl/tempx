package ua.itaysonlab.vkxreborn.playback.util;

import defpackage.AbstractC14814l;
import defpackage.AbstractC2200l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ua/itaysonlab/vkxreborn/playback/util/QueueSaveHolder$VkxMetadataState", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class QueueSaveHolder$VkxMetadataState {
    public final Map crashlytics;
    public final List loadAd;
    public final List yandex;

    public QueueSaveHolder$VkxMetadataState(List list, List list2, Map map) {
        this.yandex = list;
        this.loadAd = list2;
        this.crashlytics = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueueSaveHolder$VkxMetadataState)) {
            return false;
        }
        QueueSaveHolder$VkxMetadataState queueSaveHolder$VkxMetadataState = (QueueSaveHolder$VkxMetadataState) obj;
        return AbstractC8576l.yandex(this.yandex, queueSaveHolder$VkxMetadataState.yandex) && AbstractC8576l.yandex(this.loadAd, queueSaveHolder$VkxMetadataState.loadAd) && AbstractC8576l.yandex(this.crashlytics, queueSaveHolder$VkxMetadataState.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + AbstractC14814l.admob(this.yandex.hashCode() * 31, 31, this.loadAd);
    }

    public final String toString() {
        return "VkxMetadataState(queue=" + this.yandex + ", timeline=" + this.loadAd + ", data=" + this.crashlytics + ')';
    }

    public final LinkedHashMap yandex() {
        Map map = this.crashlytics;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2200l.firebase(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), AudioTrack.Signature((AudioTrack) entry.getValue(), null, null, null, null, 0, -1, 3));
        }
        return linkedHashMap;
    }
}
