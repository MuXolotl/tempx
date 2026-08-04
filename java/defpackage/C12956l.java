package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import javax.crypto.KeyGenerator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٌّۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12956l implements InterfaceC17639l {
    public static final C12956l yandex = new C12956l();

    public static SharedPreferencesC10429l crashlytics(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        context.getApplicationContext().getApplicationContext();
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(PSKKeyManager.MAX_KEY_LENGTH_BYTES).build();
        if (keyGenParameterSpecBuild == null) {
            C6541l.subs("KeyGenParameterSpec was null after build() check");
            return null;
        }
        Object obj = AbstractC3015l.yandex;
        if (keyGenParameterSpecBuild.getKeySize() != 256) {
            throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpecBuild.getKeySize() + " bits");
        }
        if (!Arrays.equals(keyGenParameterSpecBuild.getBlockModes(), new String[]{"GCM"})) {
            C18262l.startapp(Arrays.toString(keyGenParameterSpecBuild.getBlockModes()), "invalid block mode, want GCM got ");
            return null;
        }
        if (keyGenParameterSpecBuild.getPurposes() != 3) {
            C10754l.smaato(keyGenParameterSpecBuild.getPurposes(), "invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
            return null;
        }
        if (!Arrays.equals(keyGenParameterSpecBuild.getEncryptionPaddings(), new String[]{"NoPadding"})) {
            C18262l.startapp(Arrays.toString(keyGenParameterSpecBuild.getEncryptionPaddings()), "invalid padding mode, want NoPadding got ");
            return null;
        }
        if (keyGenParameterSpecBuild.isUserAuthenticationRequired() && keyGenParameterSpecBuild.getUserAuthenticationValidityDurationSeconds() < 1) {
            C8339l.metrica("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
            return null;
        }
        synchronized (AbstractC3015l.yandex) {
            String keystoreAlias = keyGenParameterSpecBuild.getKeystoreAlias();
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias(keystoreAlias)) {
                try {
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    keyGenerator.init(keyGenParameterSpecBuild);
                    keyGenerator.generateKey();
                } catch (ProviderException e) {
                    throw new GeneralSecurityException(e.getMessage(), e);
                }
            }
        }
        String keystoreAlias2 = keyGenParameterSpecBuild.getKeystoreAlias();
        AbstractC12472l.yandex();
        AbstractC12801l.yandex();
        Context applicationContext2 = applicationContext.getApplicationContext();
        C12714l c12714l = new C12714l();
        c12714l.f25078l = AbstractC2920l.amazon("AES256_SIV");
        if (applicationContext2 == null) {
            C8339l.metrica("need an Android context");
            return null;
        }
        c12714l.f25074l = applicationContext2;
        c12714l.f25075l = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
        c12714l.f25072l = str;
        String strStartapp = AbstractC14814l.startapp("android-keystore://", keystoreAlias2);
        if (!strStartapp.startsWith("android-keystore://")) {
            C8339l.metrica("key URI must start with android-keystore://");
            return null;
        }
        c12714l.f25077l = strStartapp;
        C2494l c2494lLicense = c12714l.crashlytics().license();
        C12714l c12714l2 = new C12714l();
        c12714l2.f25078l = AbstractC2920l.amazon("AES256_GCM");
        c12714l2.f25074l = applicationContext2;
        c12714l2.f25075l = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
        c12714l2.f25072l = str;
        String strStartapp2 = AbstractC14814l.startapp("android-keystore://", keystoreAlias2);
        if (!strStartapp2.startsWith("android-keystore://")) {
            C8339l.metrica("key URI must start with android-keystore://");
            return null;
        }
        c12714l2.f25077l = strStartapp2;
        C2494l c2494lLicense2 = c12714l2.crashlytics().license();
        return new SharedPreferencesC10429l(str, applicationContext2.getSharedPreferences(str, 0), (InterfaceC13883l) c2494lLicense2.m1179l(InterfaceC13883l.class), (InterfaceC10135l) c2494lLicense.m1179l(InterfaceC10135l.class));
    }

    public final SharedPreferences amazon(Context context, String str, boolean z) {
        C6782l c6782l = C6782l.yandex;
        c6782l.getClass();
        C8634l c8634l = C6782l.billing;
        InterfaceC13922l interfaceC13922l = C6782l.loadAd[8];
        if (((Boolean) c8634l.pro(c6782l)).booleanValue() && z) {
            AbstractC2991l.billing(AbstractC17265l.yandex(this), 6, "Skipping user prefs encryption due to failed Keystore implementation / forced", null);
            SharedPreferences sharedPreferences = AbstractC3957l.billing;
            if (sharedPreferences != null) {
                return sharedPreferences;
            }
            return null;
        }
        try {
            SharedPreferencesC10429l sharedPreferencesC10429lCrashlytics = crashlytics(context, str);
            c6782l.loadAd(false);
            return sharedPreferencesC10429lCrashlytics;
        } catch (Exception e) {
            C6782l c6782l2 = C6782l.yandex;
            c6782l2.getClass();
            C8634l c8634l2 = C6782l.mopub;
            InterfaceC13922l interfaceC13922l2 = C6782l.loadAd[9];
            if (((Boolean) c8634l2.pro(c6782l2)).booleanValue()) {
                AbstractC2991l.billing(AbstractC17265l.yandex(this), 6, "Encryption forcefully disabled due to failed Keystore implementation", null);
                c6782l2.yandex(true);
                SharedPreferences sharedPreferences2 = AbstractC3957l.billing;
                if (sharedPreferences2 != null) {
                    return sharedPreferences2;
                }
                return null;
            }
            AbstractC2991l.billing(AbstractC17265l.yandex(this), 6, AbstractC12900l.admob(e, new StringBuilder("Failed loading encrypted prefs, resetting... ")), null);
            try {
                c6782l2.loadAd(true);
                loadAd(context, str);
                return crashlytics(context, str);
            } catch (Exception e2) {
                AbstractC2991l.billing(AbstractC17265l.yandex(this), 6, AbstractC12900l.admob(e2, new StringBuilder("-> even after reset, this still fails: ")), null);
                e2.printStackTrace();
                C6782l c6782l3 = C6782l.yandex;
                c6782l3.loadAd(true);
                c6782l3.yandex(true);
                SharedPreferences sharedPreferences3 = AbstractC3957l.billing;
                return sharedPreferences3 != null ? sharedPreferences3 : null;
            }
        }
    }

    public final void loadAd(Context context, String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        AbstractC2991l.billing(AbstractC17265l.yandex(this), 6, "-> clearing keystore master key", null);
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        keyStore.deleteEntry("_androidx_security_master_key_");
        AbstractC2991l.billing(AbstractC17265l.yandex(this), 6, "-> clearing saved encrypted data", null);
        context.getSharedPreferences(str, 0).edit().clear().apply();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x019a  */
    @Override // defpackage.InterfaceC17639l
    public final void yandex(Context context) {
        C4645l c4645lAmazon;
        C16367l c16367l = new C16367l(1);
        C13268l c13268l = AbstractC10055l.yandex;
        AbstractC1051l.purchase("Must be called on the UI thread");
        new AsyncTaskC12411l(context, c16367l).execute(new Void[0]);
        C11610l c11610l = AbstractC3629l.yandex;
        VKXApplication vKXApplication = VKXApplication.f36631l;
        InterfaceC14029l interfaceC14029l = null;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        if (AbstractC3629l.yandex == null) {
            AbstractC3629l.yandex = AbstractC3629l.yandex(context);
            AbstractC3629l.loadAd = AbstractC3629l.yandex(context);
        }
        C16552l c16552l = AbstractC11463l.yandex;
        ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
        int i = 2;
        AbstractC10999l.mopub(vKXApplication, executorC6708l, 0, new C5003l(context, interfaceC14029l, 4), 2);
        AbstractC10999l.mopub(vKXApplication, executorC6708l, 0, new C5003l(context, interfaceC14029l, 5), 2);
        VKXApplication vKXApplication2 = VKXApplication.f36631l;
        if (vKXApplication2 == null) {
            vKXApplication2 = null;
        }
        AbstractC10999l.mopub(vKXApplication2, executorC6708l, 0, new C5003l(context, interfaceC14029l, i), 2);
        C11610l c11610l2 = AbstractC3629l.yandex;
        if (c11610l2 == null) {
            c11610l2 = null;
        }
        String str = C14025l.f27330l;
        C6162l.ads(context.getFilesDir());
        int i2 = 21;
        C7026l c7026l = new C7026l(i2, amazon(context.getApplicationContext(), "vk_api_preferences", true));
        C7947l c7947l = new C7947l(context);
        C16990l c16990l = new C16990l();
        C12342l c12342l = new C12342l((Function1) c16990l.f33122l, new C0783l(i2, c11610l2), 1);
        c16990l.f33122l = c12342l;
        Unit unit = Unit.INSTANCE;
        C4708l c4708l = new C4708l();
        c4708l.yandex = new C1306l(14);
        c4708l.crashlytics = 10;
        c12342l.invoke(c4708l);
        C2885l c2885l = new C2885l(c4708l);
        C16864l c16864l = new C16864l(c2885l, c16990l, true);
        C7644l c7644l = new C7644l();
        c7644l.f15738l = c7947l;
        c7644l.f15734l = new C4324l();
        c7644l.f15740l = AbstractC8618l.yandex();
        c7644l.f15739l = AbstractC8618l.yandex();
        c7644l.f15742l = c7026l;
        C4645l.Companion.getClass();
        C4645l c4645l = C4645l.smaato;
        c7644l.f15735l = c4645l;
        SharedPreferences sharedPreferences = (SharedPreferences) c7026l.f14720l;
        if (!sharedPreferences.getBoolean("vk.accountStoreMigration", false)) {
            long j = sharedPreferences.getLong("vk.defaultAccount", 0L);
            Long lValueOf = Long.valueOf(j);
            if (j == 0) {
                lValueOf = null;
            }
            C17526l c17526l = lValueOf != null ? (C17526l) AbstractC3483l.crashlytics(c7026l, C17526l.Companion.serializer(), AbstractC2812l.ads(lValueOf.longValue(), "vk.accounts."), AbstractC10651l.yandex) : null;
            if (c17526l != null) {
                long j2 = c17526l.yandex;
                String str2 = c17526l.loadAd;
                long j3 = c17526l.crashlytics;
                C2106l c2106l = C2106l.f4733l;
                AbstractC7470l.ads(c7026l, new C6232l(j2, Collections.singletonList(new C4645l(j2, str2, C16367l.license(j3, 0L), c17526l.amazon, c17526l.purchase, C16367l.license(c17526l.billing, 0L), c17526l.mopub, "", "", c17526l.admob, c17526l.subs))));
                AbstractC3483l.mopub(c7026l, C17526l.Companion.serializer(), "vk.accounts." + c17526l.yandex);
                c7026l.inmobi("vk.defaultAccount");
            }
            c7026l.signatures("vk.accountStoreMigration", true);
        }
        C6232l c6232lAdcel = AbstractC7470l.adcel(c7026l);
        if (c6232lAdcel != null) {
            long j4 = c6232lAdcel.yandex;
            Long lValueOf2 = Long.valueOf(j4);
            if (j4 <= 0) {
                lValueOf2 = null;
            }
            if (lValueOf2 != null) {
                c4645lAmazon = AbstractC2238l.amazon(c7026l, lValueOf2.longValue());
            } else {
                c4645lAmazon = null;
            }
        } else {
            c4645lAmazon = null;
        }
        if (c4645lAmazon != null) {
            c4645l = c4645lAmazon;
        }
        c7644l.f15735l = c4645l;
        AbstractC3984l.pro(AbstractC18569l.loadAd, new C9010l[]{new C9010l(c7644l, 0), new C9010l(c7644l, 1), new C9010l(c7644l, 2)});
        C16990l c16990l2 = new C16990l();
        c16990l2.purchase(c16990l);
        C18449l c18449l = AbstractC18358l.amazon;
        c16990l2.yandex(c18449l, new C10949l(15));
        c16990l2.yandex(AbstractC11201l.loadAd, new C0783l(22, c7644l));
        int i3 = 16;
        c16990l2.yandex(AbstractC4689l.loadAd, new C10949l(i3));
        C16864l c16864l2 = new C16864l(c2885l, c16990l2, c16864l.f32912l);
        c7644l.f15736l = c16864l2;
        C16990l c16990l3 = new C16990l();
        c16990l3.purchase(c16990l2);
        ((LinkedHashMap) c16990l3.f33121l).put((C11911l) c18449l.f36012l, new C17015l(3, new C10949l(14)));
        c16990l3.crashlytics(c18449l);
        c7644l.f15741l = new C16864l(c2885l, c16990l3, c16864l2.f32912l);
        VKXApplication.f36633l = c7644l;
        VKXApplication vKXApplication3 = VKXApplication.f36631l;
        if (vKXApplication3 == null) {
            vKXApplication3 = null;
        }
        AbstractC10999l.mopub(vKXApplication3, executorC6708l, 0, new C5888l(context, new C12513l((byte) 0, 9), null, i3), 2);
        C7026l c7026l2 = new C7026l(21, amazon(context.getApplicationContext(), "spark_blobs", false));
        C7026l c7026l3 = new C7026l(context.getApplicationContext());
        VKXApplication vKXApplication4 = VKXApplication.f36631l;
        if (vKXApplication4 == null) {
            vKXApplication4 = null;
        }
        C16990l c16990l4 = new C16990l();
        C12342l c12342l2 = new C12342l((Function1) c16990l4.f33122l, new C4741l(29), 1);
        c16990l4.f33122l = c12342l2;
        Unit unit2 = Unit.INSTANCE;
        C4708l c4708l2 = new C4708l();
        c4708l2.yandex = new C1306l(14);
        c4708l2.crashlytics = 10;
        c12342l2.invoke(c4708l2);
        VKXApplication.f36626l = new C5374l(c7026l3, vKXApplication4, c7026l2, new C16864l(new C2885l(c4708l2), c16990l4, true));
        SharedPreferences sharedPreferences2 = AbstractC3957l.purchase;
        if (sharedPreferences2 == null) {
            sharedPreferences2 = null;
        }
        String string = sharedPreferences2.getString("user_token", null);
        if (string != null && string.length() != 0) {
            SharedPreferences sharedPreferences3 = AbstractC3957l.purchase;
            SharedPreferences sharedPreferences4 = sharedPreferences3 != null ? sharedPreferences3 : null;
            if (sharedPreferences3 == null) {
                sharedPreferences3 = null;
            }
            if (sharedPreferences4.getLong("user_id_v2", sharedPreferences3.getInt("user_id", 0)) != 0) {
                C7644l c7644l2 = VKXApplication.f36633l;
                if (c7644l2 == null) {
                    c7644l2 = null;
                }
                C4645l c4645l2 = (C4645l) new C4741l(28).invoke((C4645l) c7644l2.f15735l);
                AbstractC2238l.isPro((C7026l) c7644l2.f15742l, c4645l2);
                c7644l2.f15735l = c4645l2;
                SharedPreferences sharedPreferences5 = AbstractC3957l.purchase;
                if (sharedPreferences5 == null) {
                    sharedPreferences5 = null;
                }
                SharedPreferences.Editor editorEdit = sharedPreferences5.edit();
                editorEdit.clear();
                editorEdit.apply();
            }
        }
        VKXApplication vKXApplication5 = VKXApplication.f36631l;
        if (vKXApplication5 == null) {
            vKXApplication5 = null;
        }
        AbstractC10999l.mopub(vKXApplication5, executorC6708l, 0, new C7520l(2, null), 2);
    }
}
