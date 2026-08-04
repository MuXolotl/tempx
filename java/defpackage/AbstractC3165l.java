package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lؕؕؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3165l implements Map.Entry {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6799l;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        switch (this.f6799l) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (AbstractC7000l.loadAd(getKey(), entry.getKey()) && AbstractC7000l.loadAd(getValue(), entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry2 = (Map.Entry) obj;
                    if (AbstractC7574l.firebase(getKey(), entry2.getKey()) && AbstractC7574l.firebase(getValue(), entry2.getValue())) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        switch (this.f6799l) {
            case 0:
                Object key = getKey();
                Object value = getValue();
                return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
            default:
                Object key2 = getKey();
                Object value2 = getValue();
                return (key2 == null ? 0 : key2.hashCode()) ^ (value2 != null ? value2.hashCode() : 0);
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        switch (this.f6799l) {
            case 0:
                return getKey() + "=" + getValue();
            default:
                return AbstractC9361l.pro(String.valueOf(getKey()), "=", String.valueOf(getValue()));
        }
    }
}
