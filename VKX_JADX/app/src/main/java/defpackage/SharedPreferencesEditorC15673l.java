package defpackage;

import android.content.SharedPreferences;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: lٕٓ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesEditorC15673l implements SharedPreferences.Editor {
    public final AtomicBoolean amazon = new AtomicBoolean(false);
    public final CopyOnWriteArrayList crashlytics = new CopyOnWriteArrayList();
    public final SharedPreferences.Editor loadAd;
    public final SharedPreferencesC10429l yandex;

    public SharedPreferencesEditorC15673l(SharedPreferencesC10429l sharedPreferencesC10429l, SharedPreferences.Editor editor) {
        this.yandex = sharedPreferencesC10429l;
        this.loadAd = editor;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        yandex();
        this.loadAd.apply();
        loadAd();
        this.crashlytics.clear();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.amazon.set(true);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.crashlytics;
        yandex();
        try {
            return this.loadAd.commit();
        } finally {
            loadAd();
            copyOnWriteArrayList.clear();
        }
    }

    public final void crashlytics(String str, byte[] bArr) {
        SharedPreferencesC10429l sharedPreferencesC10429l = this.yandex;
        sharedPreferencesC10429l.getClass();
        if (SharedPreferencesC10429l.crashlytics(str)) {
            throw new SecurityException(AbstractC12900l.firebase(str, " is a reserved key for the encryption keyset."));
        }
        this.crashlytics.add(str);
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String strYandex = sharedPreferencesC10429l.yandex(str);
            Pair pair = new Pair(strYandex, AbstractC6156l.loadAd(sharedPreferencesC10429l.amazon.yandex(bArr, strYandex.getBytes(StandardCharsets.UTF_8))));
            this.loadAd.putString((String) pair.first, (String) pair.second);
        } catch (GeneralSecurityException e) {
            C8876l.subs("Could not encrypt data: ", e.getMessage(), e);
        }
    }

    public final void loadAd() {
        SharedPreferencesC10429l sharedPreferencesC10429l = this.yandex;
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : sharedPreferencesC10429l.loadAd) {
            Iterator it = this.crashlytics.iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC10429l, (String) it.next());
            }
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.putInt(5);
        byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
        crashlytics(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(4);
        byteBufferAllocate.putFloat(f);
        crashlytics(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(2);
        byteBufferAllocate.putInt(i);
        crashlytics(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(3);
        byteBufferAllocate.putLong(j);
        crashlytics(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.put(bytes);
        crashlytics(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        if (set == null) {
            set = new C10834l(0);
            set.add("__NULL__");
        }
        ArrayList<byte[]> arrayList = new ArrayList(set.size());
        int size = set.size() * 4;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
            arrayList.add(bytes);
            size += bytes.length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
        byteBufferAllocate.putInt(1);
        for (byte[] bArr : arrayList) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        crashlytics(str, byteBufferAllocate.array());
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        SharedPreferencesC10429l sharedPreferencesC10429l = this.yandex;
        sharedPreferencesC10429l.getClass();
        if (SharedPreferencesC10429l.crashlytics(str)) {
            throw new SecurityException(AbstractC12900l.firebase(str, " is a reserved key for the encryption keyset."));
        }
        this.loadAd.remove(sharedPreferencesC10429l.yandex(str));
        this.crashlytics.add(str);
        return this;
    }

    public final void yandex() {
        if (this.amazon.getAndSet(false)) {
            SharedPreferencesC10429l sharedPreferencesC10429l = this.yandex;
            for (String str : ((HashMap) sharedPreferencesC10429l.getAll()).keySet()) {
                if (!this.crashlytics.contains(str) && !SharedPreferencesC10429l.crashlytics(str)) {
                    this.loadAd.remove(sharedPreferencesC10429l.yandex(str));
                }
            }
        }
    }
}
