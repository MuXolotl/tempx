package defpackage;

import android.content.SharedPreferences;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: lَٜۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesC10429l implements SharedPreferences {
    public final InterfaceC13883l amazon;
    public final String crashlytics;
    public final CopyOnWriteArrayList loadAd = new CopyOnWriteArrayList();
    public final InterfaceC10135l purchase;
    public final SharedPreferences yandex;

    public SharedPreferencesC10429l(String str, SharedPreferences sharedPreferences, InterfaceC13883l interfaceC13883l, InterfaceC10135l interfaceC10135l) {
        this.crashlytics = str;
        this.yandex = sharedPreferences;
        this.amazon = interfaceC13883l;
        this.purchase = interfaceC10135l;
    }

    public static boolean crashlytics(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (crashlytics(str)) {
            throw new SecurityException(AbstractC12900l.firebase(str, " is a reserved key for the encryption keyset."));
        }
        return this.yandex.contains(yandex(str));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC15673l(this, this.yandex.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.yandex.getAll().entrySet()) {
            if (!crashlytics(entry.getKey())) {
                try {
                    String str = new String(this.purchase.loadAd(AbstractC6156l.yandex(entry.getKey()), this.crashlytics.getBytes()), StandardCharsets.UTF_8);
                    String str2 = str.equals("__NULL__") ? null : str;
                    map.put(str2, loadAd(str2));
                } catch (GeneralSecurityException e) {
                    C8876l.subs("Could not decrypt key. ", e.getMessage(), e);
                    return null;
                }
            }
        }
        return map;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object objLoadAd = loadAd(str);
        return objLoadAd instanceof Boolean ? ((Boolean) objLoadAd).booleanValue() : z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object objLoadAd = loadAd(str);
        return objLoadAd instanceof Float ? ((Float) objLoadAd).floatValue() : f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object objLoadAd = loadAd(str);
        return objLoadAd instanceof Integer ? ((Integer) objLoadAd).intValue() : i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object objLoadAd = loadAd(str);
        return objLoadAd instanceof Long ? ((Long) objLoadAd).longValue() : j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object objLoadAd = loadAd(str);
        return objLoadAd instanceof String ? (String) objLoadAd : str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Object objLoadAd = loadAd(str);
        Set c10834l = objLoadAd instanceof Set ? (Set) objLoadAd : new C10834l(0);
        return c10834l.size() > 0 ? c10834l : set;
    }

    public final Object loadAd(String str) {
        int i;
        String str2;
        if (crashlytics(str)) {
            throw new SecurityException(AbstractC12900l.firebase(str, " is a reserved key for the encryption keyset."));
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strYandex = yandex(str);
            String string = this.yandex.getString(strYandex, null);
            if (string != null) {
                byte[] bArrYandex = AbstractC6156l.yandex(string);
                InterfaceC13883l interfaceC13883l = this.amazon;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(interfaceC13883l.loadAd(bArrYandex, strYandex.getBytes(charset)));
                byteBufferWrap.position(0);
                int i2 = byteBufferWrap.getInt();
                if (i2 == 0) {
                    i = 1;
                } else if (i2 == 1) {
                    i = 2;
                } else if (i2 == 2) {
                    i = 3;
                } else if (i2 == 3) {
                    i = 4;
                } else if (i2 != 4) {
                    i = i2 != 5 ? 0 : 6;
                } else {
                    i = 5;
                }
                if (i == 0) {
                    throw new SecurityException("Unknown type ID for encrypted pref value: " + i2);
                }
                int iInmobi = AbstractC5020l.inmobi(i);
                if (iInmobi == 0) {
                    int i3 = byteBufferWrap.getInt();
                    ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                    byteBufferWrap.limit(i3);
                    String string2 = charset.decode(byteBufferSlice).toString();
                    if (!string2.equals("__NULL__")) {
                        return string2;
                    }
                } else {
                    if (iInmobi != 1) {
                        if (iInmobi == 2) {
                            return Integer.valueOf(byteBufferWrap.getInt());
                        }
                        if (iInmobi == 3) {
                            return Long.valueOf(byteBufferWrap.getLong());
                        }
                        if (iInmobi == 4) {
                            return Float.valueOf(byteBufferWrap.getFloat());
                        }
                        if (iInmobi == 5) {
                            return Boolean.valueOf(byteBufferWrap.get() != 0);
                        }
                        switch (i) {
                            case 1:
                                str2 = "STRING";
                                break;
                            case 2:
                                str2 = "STRING_SET";
                                break;
                            case 3:
                                str2 = "INT";
                                break;
                            case 4:
                                str2 = "LONG";
                                break;
                            case 5:
                                str2 = "FLOAT";
                                break;
                            case 6:
                                str2 = "BOOLEAN";
                                break;
                            default:
                                str2 = "null";
                                break;
                        }
                        throw new SecurityException("Unhandled type for encrypted pref value: ".concat(str2));
                    }
                    C10834l c10834l = new C10834l(0);
                    while (byteBufferWrap.hasRemaining()) {
                        int i4 = byteBufferWrap.getInt();
                        ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                        byteBufferSlice2.limit(i4);
                        byteBufferWrap.position(byteBufferWrap.position() + i4);
                        c10834l.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                    }
                    if (c10834l.f21897l != 1 || !"__NULL__".equals(c10834l.f21898l[0])) {
                        return c10834l;
                    }
                }
            }
            return null;
        } catch (GeneralSecurityException e) {
            C8876l.subs("Could not decrypt value. ", e.getMessage(), e);
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.loadAd.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.loadAd.remove(onSharedPreferenceChangeListener);
    }

    public final String yandex(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return AbstractC6156l.loadAd(this.purchase.yandex(str.getBytes(StandardCharsets.UTF_8), this.crashlytics.getBytes()));
        } catch (GeneralSecurityException e) {
            C8876l.subs("Could not encrypt key. ", e.getMessage(), e);
            return null;
        }
    }
}
