package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: lٓۦ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14558l extends LinkedHashMap {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28505l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14558l(int i, float f, boolean z, int i2) {
        super(i, f, z);
        this.f28505l = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Matcher yandex(C14558l c14558l, String str, Pattern pattern) {
        Matcher matcher = (Matcher) c14558l.get(pattern);
        if (matcher != null) {
            matcher.reset(str);
            return matcher;
        }
        Matcher matcher2 = pattern.matcher(str);
        c14558l.put(pattern, matcher2);
        return matcher2;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.f28505l) {
            case 0:
                return size() > 4;
            default:
                return size() > 32;
        }
    }
}
