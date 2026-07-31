package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؙۢؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6829l implements InterfaceC0015l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final Pattern f14274l;

    static {
        Pattern patternCompile;
        try {
            patternCompile = Pattern.compile("(?ui)\\W", PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        } catch (IllegalArgumentException unused) {
            patternCompile = Pattern.compile("(?ui)\\W");
        }
        f14274l = patternCompile;
    }

    @Override // defpackage.InterfaceC0015l
    /* JADX INFO: renamed from: apply */
    public final String mo2021apply(Object obj) {
        String strReplaceAll = (String) obj;
        Matcher matcher = f14274l.matcher(strReplaceAll);
        if (matcher.find()) {
            strReplaceAll = matcher.replaceAll(" ");
        }
        return strReplaceAll.toLowerCase().trim();
    }
}
