package ua.itaysonlab.catalogkit.objects;

import defpackage.AbstractC2812l;
import defpackage.AbstractC8576l;
import defpackage.InterfaceC15749l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0014\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\b\u0082\u0001\u0014\r\t\b\u0005\u0015\u000e\u000f\u0016\n\u0007\f\u0017\u000b\u0006\u0013\u0018\u0011\u0010\u0012\b¨\u0006\u0019"}, d2 = {"Lua/itaysonlab/catalogkit/objects/Catalog2ButtonAction;", "", "OpenUrl", "Share", "PlayVkMix", "lِؓۡ", "lٔ۟ؓ", "lؑۤۛ", "lًٟؗ", "lِٟٔ", "lٜٓۚ", "lًؐۥ", "lؑٔٝ", "lَٖٚ", "lٍٖؒ", "lؘؑۦ", "lؔؕۤ", "lؖ۟ۥ", "lًًؚ", "lؘؖۥ", "SynthCustomAction", "Lua/itaysonlab/catalogkit/objects/Catalog2ButtonAction$OpenUrl;", "Lua/itaysonlab/catalogkit/objects/Catalog2ButtonAction$PlayVkMix;", "Lua/itaysonlab/catalogkit/objects/Catalog2ButtonAction$Share;", "Lua/itaysonlab/catalogkit/objects/Catalog2ButtonAction$SynthCustomAction;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public abstract class Catalog2ButtonAction {

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/Catalog2ButtonAction$OpenUrl;", "Lua/itaysonlab/catalogkit/objects/Catalog2ButtonAction;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class OpenUrl extends Catalog2ButtonAction {
        public final String yandex;

        public OpenUrl(String str) {
            this.yandex = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUrl) && AbstractC8576l.yandex(this.yandex, ((OpenUrl) obj).yandex);
        }

        public final int hashCode() {
            return this.yandex.hashCode();
        }

        public final String toString() {
            return AbstractC2812l.tapsense(new StringBuilder("OpenUrl(url="), this.yandex, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/Catalog2ButtonAction$PlayVkMix;", "Lua/itaysonlab/catalogkit/objects/Catalog2ButtonAction;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class PlayVkMix extends Catalog2ButtonAction {
        public final String yandex;

        public PlayVkMix(String str) {
            this.yandex = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PlayVkMix) && AbstractC8576l.yandex(this.yandex, ((PlayVkMix) obj).yandex);
        }

        public final int hashCode() {
            return this.yandex.hashCode();
        }

        public final String toString() {
            return AbstractC2812l.tapsense(new StringBuilder("PlayVkMix(style="), this.yandex, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/Catalog2ButtonAction$Share;", "Lua/itaysonlab/catalogkit/objects/Catalog2ButtonAction;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final /* data */ class Share extends Catalog2ButtonAction {
        public final String yandex;

        public Share(String str) {
            this.yandex = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Share) && AbstractC8576l.yandex(this.yandex, ((Share) obj).yandex);
        }

        public final int hashCode() {
            return this.yandex.hashCode();
        }

        public final String toString() {
            return AbstractC2812l.tapsense(new StringBuilder("Share(url="), this.yandex, ')');
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/catalogkit/objects/Catalog2ButtonAction$SynthCustomAction;", "Lua/itaysonlab/catalogkit/objects/Catalog2ButtonAction;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @InterfaceC15749l(generateAdapter = true)
    public static final class SynthCustomAction extends Catalog2ButtonAction {
        public final transient Function1 amazon;
        public final int crashlytics;
        public final String loadAd;
        public final String yandex;

        public SynthCustomAction(String str, String str2, int i, Function1 function1) {
            this.yandex = str;
            this.loadAd = str2;
            this.crashlytics = i;
            this.amazon = function1;
        }
    }
}
