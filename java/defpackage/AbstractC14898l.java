package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: lٔٔٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14898l {
    public static final Map yandex;

    static {
        HashMap map = new HashMap();
        AbstractC11043l.firebase(13004, map, "RIPEMD128", 12748, "RIPEMD160");
        AbstractC11043l.firebase(13260, map, "SHA-1", 14540, "SHA-224");
        AbstractC11043l.firebase(13516, map, "SHA-256", 14028, "SHA-384");
        AbstractC11043l.firebase(13772, map, "SHA-512", 14796, "SHA-512/224");
        AbstractC11043l.firebase(15052, map, "SHA-512/256", 14284, "Whirlpool");
        yandex = DesugarCollections.unmodifiableMap(map);
    }
}
