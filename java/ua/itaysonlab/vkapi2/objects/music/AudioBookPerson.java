package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC0653l;
import defpackage.AbstractC14814l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC12360l;
import defpackage.InterfaceC15749l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioBookPerson;", "Llُّؔ;", "AudioBookPersonRole", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final /* data */ class AudioBookPerson implements InterfaceC12360l {
    public final List amazon;
    public final String crashlytics;
    public final Integer loadAd;
    public final List purchase;
    public final String yandex;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/AudioBookPerson$AudioBookPersonRole;", "", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class AudioBookPersonRole {
        public final String yandex;

        public AudioBookPersonRole(String str) {
            this.yandex = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AudioBookPersonRole) && AbstractC8576l.yandex(this.yandex, ((AudioBookPersonRole) obj).yandex);
        }

        public final int hashCode() {
            return this.yandex.hashCode();
        }

        public final String toString() {
            return AbstractC2812l.tapsense(new StringBuilder("AudioBookPersonRole(id="), this.yandex, ')');
        }
    }

    public AudioBookPerson(String str, Integer num, String str2, List list, List list2) {
        this.yandex = str;
        this.loadAd = num;
        this.crashlytics = str2;
        this.amazon = list;
        this.purchase = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioBookPerson)) {
            return false;
        }
        AudioBookPerson audioBookPerson = (AudioBookPerson) obj;
        return AbstractC8576l.yandex(this.yandex, audioBookPerson.yandex) && AbstractC8576l.yandex(this.loadAd, audioBookPerson.loadAd) && AbstractC8576l.yandex(this.crashlytics, audioBookPerson.crashlytics) && AbstractC8576l.yandex(this.amazon, audioBookPerson.amazon) && AbstractC8576l.yandex(this.purchase, audioBookPerson.purchase);
    }

    @Override // defpackage.InterfaceC12360l
    /* JADX INFO: renamed from: getItemId */
    public final String getYandex() {
        return String.valueOf(this.loadAd);
    }

    public final int hashCode() {
        String str = this.yandex;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.loadAd;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.crashlytics;
        return this.purchase.hashCode() + AbstractC14814l.admob((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.amazon);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBookPerson(description=");
        sb.append(this.yandex);
        sb.append(", id=");
        sb.append(this.loadAd);
        sb.append(", name=");
        sb.append(this.crashlytics);
        sb.append(", photo=");
        sb.append(this.amazon);
        sb.append(", roles=");
        return AbstractC0653l.subscription(sb, this.purchase, ')');
    }
}
